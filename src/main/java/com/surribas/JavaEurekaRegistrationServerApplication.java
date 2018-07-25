package com.surribas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JavaEurekaRegistrationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaEurekaRegistrationServerApplication.class, args);
	}
}
