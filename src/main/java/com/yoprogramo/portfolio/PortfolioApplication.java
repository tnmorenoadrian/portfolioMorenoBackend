package com.yoprogramo.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfolioApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
    
	/**
     * CORS configuration
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
			        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
					.allowedHeaders("header1", "header2", "header3")
					.exposedHeaders("Authorization")
					.allowedOrigins("http://localhost:4200","http://localhost:8081");
			WebMvcConfigurer.super.addCorsMappings(registry);
		}
    
}
