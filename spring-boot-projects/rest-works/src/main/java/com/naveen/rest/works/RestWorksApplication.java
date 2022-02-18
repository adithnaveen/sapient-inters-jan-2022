package com.naveen.rest.works;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// to invoke swagger 
//http://localhost:9090/v3/api-docs/
//http://localhost:9090/swagger-ui/index.html


// to invoke hal browser 
//http://localhost:9090/

@EnableEurekaClient
@SpringBootApplication
public class RestWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWorksApplication.class, args);
	}

	
}
