package com.criss.wang.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.criss.wang.entity.Employee;

@Mapper
public interface EmployeeMapper {

	@Select("SELECT * FROM employee WHERE id = #{id}")
	public Employee getEmployee(Integer id);
	
	@Update("UPDATE employee SET lastName = #{lastName}, email = #{email}, gender = #{gender}, d_id = #{dId} where id = #{id}")
	public void updateEmp(Employee emp);
	
	@Delete("DELETE FROM employee WHERE id = #{id}")
	public void deleteEmployee(Integer id);
	
	@Insert("INSERT INTO employee (lastName, email, gender, d_id) VALUES (#{lastName}, #{email}, #{gender}, #{dId})")
	public void insertEmployee(Employee employee);
}
