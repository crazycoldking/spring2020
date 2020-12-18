package org.codeboy.conditon;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

public class MyImportSelector implements ImportSelector {

    /**
     * Select components from importing class meta data
     *
     * @param importingClassMetadata Annotation Metadata
     * @return Class qualification which meets condition
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        System.out.println("- Class Name: " + importingClassMetadata.getClassName());
        for (String annotationType : annotationTypes) {
            System.out.println("Annotation Type: " + annotationType);
        }
        // do not return null here, will cause null pointer exception
        return new String[]{
                "org.codeboy.bean.Role",
                "org.codeboy.bean.Title"
        };
    }
}
