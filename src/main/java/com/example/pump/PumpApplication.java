package com.example.pump;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
//@ComponentScan("com.example")
@EnableWebMvc
@MapperScan("com.example.pump.mapper")
public class PumpApplication {

	public static void main(String[] args) {
		SpringApplication.run(PumpApplication.class, args);
	}

}
