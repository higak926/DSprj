package com.DSprj.DSprj002.kajitool.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
	http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
	.and().oauth2Login()
	.and().authorizeRequests()
	  .mvcMatchers(HttpMethod.POST, "/**/*").authenticated()
	  .mvcMatchers(HttpMethod.PUT, "/**/*").authenticated()
	  .mvcMatchers(HttpMethod.DELETE, "/**/*").authenticated()
	  .anyRequest().permitAll()
	;
  }

}
