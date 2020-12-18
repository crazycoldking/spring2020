package org.codeboy.conditon;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ActorCondition implements Condition {
    /**
     * Use role as condition to determine whether people matches
     * @param context Condition Context
     * @param metadata Annotated Type Metadata
     * @return Return true if condition matched, otherwise return false
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String role = environment.getProperty("role");
        // get class loader
        ClassLoader classLoader = context.getClassLoader();
        // get registry of beans
        BeanDefinitionRegistry registry = context.getRegistry();
        // get bean factory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        if ("Actor".equals(role)) {
            return true;
        }

        return false;
    }
}
