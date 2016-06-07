package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.Environment;
import reactor.core.Reactor;
import reactor.core.spec.Reactors;
import reactor.spring.context.config.EnableReactor;

@SpringBootApplication
@EnableReactor
public class ReactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactorApplication.class, args);
	}
	
	 @Bean
	  public Reactor reactor(Environment env) {
	    // implicit Environment is injected into bean def method
	    return Reactors.reactor().env(env).get();
	  }
}
