package com.mongo.config;

import java.io.EOFException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import com.mongo.utils.LibraryUtils;

@Configuration
@EnableWebSecurity
public class ApplicationConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private BasicAuthenticationPoint basicAuthenticationPoint;
	@Autowired
	private LibraryUtils libraryUtils;

	@Bean
	public CommonsRequestLoggingFilter logFilter() throws EOFException {
		CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
		filter.setBeforeMessagePrefix(
				"=================================Before Request Processed======================== : ");
		filter.setIncludeQueryString(true);
		filter.setIncludePayload(true);
		filter.setMaxPayloadLength(20000);
		filter.setIncludeHeaders(false);
		filter.setAfterMessagePrefix("=================================REQUEST DATA======================== : ");
		return filter;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/", "/api/**").permitAll().anyRequest().authenticated();
		http.httpBasic().authenticationEntryPoint(basicAuthenticationPoint);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser(libraryUtils.getApiusername())
				.password(libraryUtils.getApiuserpassword()).roles("USER");
	}

}
