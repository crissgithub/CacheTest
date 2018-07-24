package com.criss.wang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.criss.wang.entity.Employee;
import com.criss.wang.entity.Person;
import com.criss.wang.entity.Student;
import com.criss.wang.mapper.EmployeeMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheTestApplicationTests {

	@Autowired
	Person person;
	
	@Autowired
	Student student;
	
//	@Autowired
//	ApplicationContext ioc;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	private RedisTemplate<Object, Employee> empRedisTemplate;
	
//	@Test
//	public void testRedis1() {
//		stringRedisTemplate.opsForValue().append("a", "hello");
//	}
	
//	@SuppressWarnings("unchecked")
//	@Test
//	public void testRedis2() {
//		System.out.println("开始");
//		Employee employee = employeeMapper.getEmployee(1);
//		redisTemplate.opsForValue().set("emp", employee);
//		System.out.println("完成");
//	}
	
	@Test
	public void testRedis3() {
		System.out.println("自定义开始");
		Employee emp = employeeMapper.getEmployee(1);
		empRedisTemplate.opsForValue().set("emp1", emp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void contextLoads() {
//		System.out.println("==========&&&&======&&&&===========");
//		Employee employee = employeeMapper.getEmployee(1);
//		System.out.println(employee);
//		System.out.println("===========================");
//		
//		
////		System.out.println(person.toString());
////		
////		System.out.println(student.toString());
////		
////		boolean b = ioc.containsBean("helloService");
////		boolean a = ioc.containsBean("testService");
////		
////		System.out.println(b);
////		System.out.println(a);
//		
//	}

}
