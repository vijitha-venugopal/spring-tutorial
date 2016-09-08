package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test1")
public class Test1ProfileConfig {

  @Bean
  public Person employee() {

    return new Person("John", "Smith", 55);
  }
}