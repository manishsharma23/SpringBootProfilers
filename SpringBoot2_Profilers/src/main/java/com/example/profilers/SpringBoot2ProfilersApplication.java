package com.example.profilers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.profile.configuration.User;

@SpringBootApplication
public class SpringBoot2ProfilersApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBoot2ProfilersApplication.class, args); 
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	       ctx.getEnvironment().setActiveProfiles("dev");
	       ctx.scan("com.profile.configuration");
	       ctx.refresh();
	       User user = ctx.getBean(User.class);
	       System.out.println("id:"+user.id +", Name:"+ user.name );
	   
	}

}
