package com.criss.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:beans.xml"})
@ComponentScan("com.criss.wang")  // 扫描Mapper包
@SpringBootApplication
@EnableCaching  // 开启基于注解的缓存
public class CacheTestApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CacheTestApplication.class, args);
	}
}
