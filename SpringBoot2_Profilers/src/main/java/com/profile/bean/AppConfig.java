package com.profile.bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
  @Bean
  @Profile({"cow", "buffalo", "goat"})
  DomesticAnimal domesticAnimal() {
     return new DomesticAnimal();
  }
  @Bean
  @Profile("lion")
  Lion lion() {
     return new Lion();
  }
} 