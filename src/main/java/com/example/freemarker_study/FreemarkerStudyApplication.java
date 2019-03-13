package com.example.freemarker_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class FreemarkerStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreemarkerStudyApplication.class, args);
	}

}
