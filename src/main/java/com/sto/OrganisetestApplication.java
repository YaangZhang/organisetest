package com.sto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @MapperScan("com.sto.mapper") //在多数据源的情况下，我们不需要在启动类添加
public class OrganisetestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganisetestApplication.class, args);
	}

}
