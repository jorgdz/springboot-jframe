package com.github.com.jorgdz.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.github.com.jorgdz.app.controllers.PersonController;

@SpringBootApplication
public class SpringbootJframeApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(SpringbootJframeApplication.class)
				.headless(false)
				.run(args);
		
		PersonController personControl = ctx.getBean(PersonController.class);
		personControl.getIndex().setVisible(true);
	}

}
