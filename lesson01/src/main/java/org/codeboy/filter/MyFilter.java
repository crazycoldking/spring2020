package org.codeboy.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyFilter implements TypeFilter {
    /**
     * 我的自定义过滤规则
     *
     * @param metadataReader        MetadataReader可以获取当前正在扫描的类的信息
     * @param metadataReaderFactory MetadataReaderFactory可以获取其他任何类的信息
     * @return 如果满足条件就返回true
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
        // 获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        // 获取当前扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        String className = classMetadata.getClassName();
        System.out.println("Scanning - " + className);
        // 获取当前扫描的类的资源信息
        Resource resource = metadataReader.getResource();

        if (className.contains("Person")) {
            return true;
        }

        return false;
    }
}
