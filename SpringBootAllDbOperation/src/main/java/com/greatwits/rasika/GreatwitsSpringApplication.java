package com.greatwits.rasika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.greatwits.rashika.controller,com.Dbconfigration.greatwits" })
public class GreatwitsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreatwitsSpringApplication.class, args);
	}

}
