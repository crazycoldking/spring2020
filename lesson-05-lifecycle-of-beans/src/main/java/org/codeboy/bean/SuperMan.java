package org.codeboy.bean;

import lombok.extern.java.Log;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Log
public class SuperMan extends Person{

    public SuperMan(String name, int age) {
        super(name, age);
    }

    public SuperMan() {
    }

    @PostConstruct
    public void action1() {
        log.info("> Superman Post Construct");
    }

    @PreDestroy
    public void action2() {
        log.info("> Superman Pre Destroy");
    }
}