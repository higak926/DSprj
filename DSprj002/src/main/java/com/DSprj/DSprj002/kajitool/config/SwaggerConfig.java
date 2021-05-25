package com.DSprj.DSprj002.kajitool.config;

import static com.google.common.base.Predicates.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
  @Bean
  public Docket document() {
	return new Docket(DocumentationType.SWAGGER_2)
		.select().paths(paths()).build();
  }

  private Predicate<String> paths() {
	return or(containsPattern("/*"));
  }

}
