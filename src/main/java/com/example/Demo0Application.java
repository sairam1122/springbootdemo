package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration
public class Demo0Application extends WebMvcConfigurerAdapter{

	

	@Value("${spring.mvc.view.prefix}")
	String prefix;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo0Application.class, args);
	}

	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/welcome").setViewName("welcome");
        registry.addViewController("/addProduct").setViewName("AddProduct");
        registry.addViewController("/editProduct").setViewName("edit");

	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {

	  registry.jsp().prefix(prefix);
	
	}
	
}
