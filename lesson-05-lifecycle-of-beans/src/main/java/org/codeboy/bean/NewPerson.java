package org.codeboy.bean;

import lombok.extern.java.Log;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Log
public class NewPerson extends Person implements InitializingBean, DisposableBean {

    public NewPerson(String name, int age) {
        super(name, age);
        log.info("> Constructing a new person with name and age... ");
    }

    public NewPerson() {
        log.info("> Construct a new person... ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    /**
     * Actions be invoked automatically After Properties Set
     */
    @Override
    public void afterPropertiesSet() {
        log.info("> Person afterPropertiesSet... ");
    }


    /**
     * Actions be invoked automatically After application context closed
     */
    @Override
    public void destroy() {
        log.info("> Person destroy... ");
    }
}
