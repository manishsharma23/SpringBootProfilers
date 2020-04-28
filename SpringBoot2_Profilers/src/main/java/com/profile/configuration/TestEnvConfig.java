package com.profile.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestEnvConfig {
	@Bean
	public User getUser() {
		return new User(300, "Test User");
	}
}