package com.biblioteca.libro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.biblioteca.libro.service.LibroService;

@SpringBootApplication
public class LibroApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibroApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			LibroService service = ctx.getBean(LibroService.class);
			service.fetchLibro();
		};
	}

}
