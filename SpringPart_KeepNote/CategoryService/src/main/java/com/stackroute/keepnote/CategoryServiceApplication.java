package com.stackroute.keepnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.stackroute.keepnote.jwtfilter.JwtFilter;

@SpringBootApplication
public class CategoryServiceApplication {

	/*
	 * Define the bean for Filter registration. Create a new FilterRegistrationBean
	 * object and use setFilter() method to set new instance of JwtFilter object.
	 * Also specifies the Url patterns for registration bean.
	 */
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean filterBean = new FilterRegistrationBean();
		filterBean.setFilter(new JwtFilter());
		filterBean.addUrlPatterns("/api/*");
		return filterBean;
	}

	/*
	 * 
	 * You need to run SpringApplication.run, because this method start whole spring
	 * framework. Code below integrates your main() with SpringBoot
	 */

	public static void main(String[] args) {
		SpringApplication.run(CategoryServiceApplication.class, args);
	}
}
