package com.profile.morethan2.otherfeatures;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!eligible")
public class SchoolConfig {
   @Bean
   public Work getWork(){
	return new Work("Studying in my school.");
   }
} 