package com.example.profilers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.profile.component.Animal;
import com.profile.configuration.User;
import com.profile.morethan2.otherfeatures.Work;

@SpringBootApplication
public class SpringBoot2ProfilersApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringBoot2ProfilersApplication.class, args);

		/*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("dev");
		ctx.scan("com.profile.configuration");
		ctx.refresh();
		User user = ctx.getBean(User.class);
		System.out.println("id:" + user.id + ", Name:" + user.name);
*/
		/*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.getEnvironment().setActiveProfiles("goat");
	    ctx.scan("com.profile.component");
	    ctx.refresh();
	    Animal animal = ctx.getBean(Animal.class);
	    System.out.println(animal.getMessage()); */
		
	/*	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("buffalo");
		ctx.scan("com.profile.bean");
		ctx.refresh();
		com.profile.bean.Animal animal = ctx.getBean(com.profile.bean.Animal.class);
//		Animal animal = ctx.getBean(Animal.class);
		System.out.println("============="+animal.getMessage());
	  */
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    //ctx.getEnvironment().setActiveProfiles("eligible", "busy");
						//or
		ctx.getEnvironment().setActiveProfiles("eligible", "free");
		      //  or
		//ctx.getEnvironment().setActiveProfiles("busy");
		
	    ctx.scan("com.profile.morethan2.otherfeatures");		
	    ctx.refresh();
	    com.profile.morethan2.otherfeatures.Work ob = ctx.getBean(com.profile.morethan2.otherfeatures.Work.class);
	    System.out.println("------>>>"+ob.desc);
	}

}
