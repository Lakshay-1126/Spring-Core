package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//Generally we use @ComponentScan to give the base package
@ComponentScan("com.app")
// That means all your classes present inside this package annotation based
// their itself
@PropertySource("classpath:lakshay.properties")
// I want to tell  go to src/main/resource (class path meaning) and the file name is 
// myapp.properties and load

//1. First annotation will try to find the classes from the current package com.app
// app package and sub package 

//2. Second annotation will try to load the properties file
// Annotation you can write in any order (Annotation ever follow order over a class)
//Now let us try to read the data
public class MyAppConfig {

}
