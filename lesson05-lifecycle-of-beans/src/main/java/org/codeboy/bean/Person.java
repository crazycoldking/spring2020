package org.codeboy.bean;

import lombok.extern.java.Log;

@Log
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        log.info("> Constructing a person with name and age... ");
        this.name = name;
        this.age = age;
    }

    public Person() {
        log.info("> Construct a person... ");
    }

    public void init() {
        log.info("> Initialize the person... ");
        this.name = "Kobe";
        this.age = 18;
    }

    public void destroy() {
        log.info("> Destroy the person... ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
