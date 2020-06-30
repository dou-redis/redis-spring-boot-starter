package com.dou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class RedisTestApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RedisTestApplication.class, args);
	}
}
