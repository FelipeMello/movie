package com.movie.library.movie.library.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageConfiguration {

  @Bean(name = "messageSource")
  public ReloadableResourceBundleMessageSource messageSource() {
    ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();
    messageBundle.setBasename("classpath:Messages");
    messageBundle.setDefaultEncoding("UTF-8");
    return messageBundle;
  }
}
