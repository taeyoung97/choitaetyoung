package com.example.demo;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class HaProxyApplication {
	
	public static String port;
	
	public static void main(String[] args) {
		System.getProperties().put("192.168.110.203", args[0]);
		port = args[0];
		
		SpringApplication.run(HaProxyApplication.class, args);
	}

}
