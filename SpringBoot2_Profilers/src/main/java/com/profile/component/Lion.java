package com.profile.component;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("lion")
public class Lion implements Animal {
   @Override
   public String getMessage() {
	return "Hello Lion!";
   }
} 