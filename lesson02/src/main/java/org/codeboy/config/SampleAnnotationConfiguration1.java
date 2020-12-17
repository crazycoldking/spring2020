package org.codeboy.config;

import org.codeboy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SampleAnnotationConfiguration1 {

    // Scope用于指定bean的使用域：
    // （默认）Singleton -- 在整个应用的生命周期中只有一个实例， IoC容器启动时就会创建这个实例（默认饿汉模式）
    // prototype -- 每次获取到的都是一个新的实例
    // request -- 同一次请求中共用同一个实例
    // session -- 一次会话中共用一个实例
    // @Scope(value = "prototype")
    @Bean(value = {"farmer"})
    public Person person() {
        System.out.println("Create a new Person instance!");
        return new Person("Joy", 25);
    }
}
