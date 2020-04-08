package ru.dgpg.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("ru.dgpg.spring")
@EnableWebMvc
public class SpringConfig {
}
