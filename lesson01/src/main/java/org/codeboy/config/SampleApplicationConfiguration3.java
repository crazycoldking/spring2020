package org.codeboy.config;

import org.codeboy.filter.MyFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Scan current/specific package
 * All components annotated by @Controller @Service @Repository @Component will be registered into IoC container
 */
@ComponentScan(value = {"org.codeboy.controller"})
public class SampleApplicationConfiguration3 {


}
