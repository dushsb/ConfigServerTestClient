package com.libertyinsurance.configuration.client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}
	
	@RefreshScope
	@RestController
	class myController{
		
		@Value("${message:Hello}")
		private String message;
		
		@RequestMapping("/message")
		String getMessage(){
			return this.message;
		}
	}
}
