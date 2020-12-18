package org.codeboy;

import org.codeboy.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigRunner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        Object student = applicationContext.getBean("student");
        System.out.println(student);

        System.out.println(bean == student);
    }
}
