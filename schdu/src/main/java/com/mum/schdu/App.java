package com.mum.schdu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



/**
 * Hello world!
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.mum.schdu.controller"})
public class App extends SpringBootServletInitializer
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}
}
