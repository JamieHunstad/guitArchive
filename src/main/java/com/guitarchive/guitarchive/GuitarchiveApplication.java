package com.guitarchive.guitarchive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GuitarchiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuitarchiveApplication.class, args);
	}
	@Configuration
	public class WebConfig
	{
		@Bean
		public WebMvcConfigurer corsConfigurer()
		{
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**")
							.allowedOrigins("http://localhost:4200")
							.allowedMethods("GET", "POST", "PUT", "DELETE")
							.allowedHeaders("*")
							.allowCredentials(true)
							.exposedHeaders("Authorization");
				}
			};
		}
	}


}
