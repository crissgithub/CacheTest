package com.criss.wang.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.criss.wang.entity.Employee;
import com.criss.wang.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		Employee emp = employeeService.getEmployeeById(id);
		return emp;
	}
	
	@RequestMapping(value = "/emp", method = RequestMethod.PUT)
	public Employee updateEmp(Employee employee){
        System.out.println("updateEmp:"+employee);
        employeeService.updateEmp(employee);
        return employee;
    }
	
	@RequestMapping(value = "/delemp", method = RequestMethod.DELETE)
	public String deleteEmp(@RequestParam("id") Integer id) {
		employeeService.deleteEmp(id);
		return "success";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "kdfjkdfj";
	}
}
