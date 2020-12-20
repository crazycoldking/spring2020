package org.codeboy.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * Sample usage of @Value annotation
 * - pure value
 * - SPEL #{}
 * - ${} environment properties
 */
public class Teacher {

    @Value("${name}")
    private String name;
    @Value("#{10-2}")
    private int age;
    @Value("M")
    private String gender;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Teacher(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Teacher() {
        System.out.println(("> Construct a person... "));
    }

    public void init() {
        System.out.println(("> Initialize the person... "));
        this.name = "Kobe";
        this.age = 18;
    }

    public void destroy() {
        System.out.println(("> Destroy the person... "));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
