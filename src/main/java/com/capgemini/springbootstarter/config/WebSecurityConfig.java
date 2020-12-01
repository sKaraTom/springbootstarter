package com.capgemini.springbootstarter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Value("${spring.profiles.active}")
	private String profile;
	
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {

    	if("locale".equals(profile)) {
            http.authorizeRequests()
            .antMatchers("/").permitAll()
            .antMatchers("/h2-console/**").permitAll();

		    http.csrf().disable();
		    http.headers().frameOptions().disable();
    		
    	}
    }
}
