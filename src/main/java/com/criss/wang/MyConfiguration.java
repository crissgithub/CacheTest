package com.criss.wang;

import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.Arrays;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import com.criss.wang.entity.Employee;
import com.criss.wang.service.TestService;

/**
 * 
 * @author Administrator
 *
 * @date 2018-06-30 14:37:51
 *
 * @Description 用@Configuration 生成自己的配置类，指明当前类是一个配置类：相当于spring的beans.xml配置文件
 */
@Configuration
public class MyConfiguration {

	// 方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
	@Bean
	public TestService testService() {
		System.out.println("");
		return new TestService();
	}

	// 自定义KeyGenerator
	@Bean("myKeyGenerator")
	public KeyGenerator myKeyGenerator() {
		return new KeyGenerator() {
			public Object generate(Object target, Method method, Object... params) {
				return method.getName() + "[" + Arrays.asList(params).toString() + "]";
			}
		};
	}
	
	@Bean
	public RedisTemplate<Object, Employee> empRedisTemplate(
			RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
		RedisTemplate<Object, Employee> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		Jackson2JsonRedisSerializer<Employee> serializer = new Jackson2JsonRedisSerializer<>(Employee.class);
		template.setDefaultSerializer(serializer);
		return template;
	} 
}
