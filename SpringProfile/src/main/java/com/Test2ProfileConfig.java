package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test2")
public class Test2ProfileConfig {

  @Bean
  public Person employee() {

    return new Person("Fred", "Williams", 22);
  }
}