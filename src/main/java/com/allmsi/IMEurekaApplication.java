package com.allmsi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@SpringBootApplication
@RestController
public class IMEurekaApplication {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(IMEurekaApplication.class).web(true).run(args);
	}

	@RequestMapping("/")
	public String index() {

		return "Hello Docker .";
	}
}