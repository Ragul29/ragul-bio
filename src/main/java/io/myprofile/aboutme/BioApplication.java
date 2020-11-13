package io.myprofile.aboutme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication

@ComponentScan(basePackages={"io.myprofile.aboutme.controllers"})
public class BioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BioApplication.class, args);
		System.out.println("entered innew BIo main function.............");
	}

	
}
