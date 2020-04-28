package com.profile.context;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevCustomizer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
   @Override
   public void customize(ConfigurableServletWebServerFactory factory) {
	factory.setContextPath("/spring-boot-dev");
	factory.setPort(8484);		
   }
}