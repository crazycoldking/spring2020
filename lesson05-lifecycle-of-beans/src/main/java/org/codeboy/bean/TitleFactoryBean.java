package org.codeboy.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Spring factory bean
 */
public class TitleFactoryBean implements FactoryBean<Title> {
    public Title getObject() {
        return new Title();
    }

    public Class<?> getObjectType() {
        return Title.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
