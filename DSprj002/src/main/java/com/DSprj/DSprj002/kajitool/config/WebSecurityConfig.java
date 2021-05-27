package com.DSprj.DSprj002.kajitool.config;

import javax.servlet.http.HttpServletResponse;

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
	.and()
		.exceptionHandling()
		.authenticationEntryPoint((request, response, AuthException) -> {
		  response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		})
	.and().oauth2Login()
	.defaultSuccessUrl("/", true)
	.and().authorizeRequests()
	  .mvcMatchers(HttpMethod.POST, "/**/*").authenticated()
	  .mvcMatchers(HttpMethod.PUT, "/**/*").authenticated()
	  .mvcMatchers(HttpMethod.DELETE, "/**/*").authenticated()
	  .mvcMatchers("/v1/account").authenticated()
	  .anyRequest().permitAll()
	;
  }

}
