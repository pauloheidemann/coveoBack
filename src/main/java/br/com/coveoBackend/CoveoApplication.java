package br.com.coveoBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.coveoBackend")
@EntityScan(basePackages = "br.com.coveoBackend")
public class CoveoApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(CoveoApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CoveoApplication.class);
	}
	
}
