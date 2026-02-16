package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Common package for all
// Means go and search the classes in this package and sub-package
// No property file nothing
// No default base package given by Spring Core You must mention one package name 
@Configuration
@ComponentScan(basePackages ="com.app")
public class MyAppConfig {

}
