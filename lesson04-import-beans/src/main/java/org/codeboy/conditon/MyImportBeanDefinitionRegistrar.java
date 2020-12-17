package org.codeboy.conditon;

import org.codeboy.bean.Role;
import org.codeboy.bean.Title;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * Register bean definition
     * @param importingClassMetadata Annotation Metadata
     * @param registry Bean Definition Registry
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(" - " + beanDefinitionName);
        }

        if (registry.containsBeanDefinition("person2")) {
            BeanDefinition beanDefinition = new RootBeanDefinition(Title.class);
            registry.registerBeanDefinition("title", beanDefinition);
        }
    }
}
