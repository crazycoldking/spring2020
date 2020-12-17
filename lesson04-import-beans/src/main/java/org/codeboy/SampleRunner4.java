package org.codeboy;

import org.codeboy.bean.Title;
import org.codeboy.bean.TitleFactoryBean;
import org.codeboy.config.SampleAnnotationConfiguration4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleRunner4 {
    public static void main(String[] args) {
        System.setProperty("role", "Programmer");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleAnnotationConfiguration4.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
            System.out.println(applicationContext.getBean(beanDefinitionName));
        }

        Object tt = applicationContext.getBean("tt");
        Title bean = applicationContext.getBean(Title.class);

        if (tt == bean) {
            System.out.println("Same title instance!");
        } else {
            System.out.println("Different title instance!");
        }

        // Tips: get factory bean, use & and bean id as the bean name
        String name = "&tt";
        TitleFactoryBean titleFactoryBean = (TitleFactoryBean) applicationContext.getBean(name);
        System.out.println(titleFactoryBean.getClass().getName());

    }
}
