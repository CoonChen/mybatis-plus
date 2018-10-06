package com.coon.mybaitsplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.coon.mybaitsplus.repository")
public class MybaitsplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybaitsplusApplication.class, args);
	}
}
