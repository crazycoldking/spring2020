package org.codeboy.config;

import org.codeboy.bean.Person;
import org.codeboy.filter.MyFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 启动包扫描，凡是标注了@Controller @Service @Repository @Component的组件都会被自动注册到容器中
 * 同理，也可以在Beans.xml文件中开启组件扫描
 * 可用通过指定ComponentScan的包来控制访问限制
 *
 * @ComponentScan还可以写多次来实现更灵活的扫描
 */
@ComponentScan(value = {"org.codeboy"},
        // excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})}

        // 如果使用includeFilters则必须配合使用useDefaultFilters = false
        useDefaultFilters = false,
        includeFilters = {
                // 根据注解的类型进行过滤
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
                // 根据自定义类型进行过滤
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Person.class}),
                // 这种过滤器用的很少，暂不讨论
                // @ComponentScan.Filter(type = FilterType.ASPECTJ, classes = {})
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyFilter.class})

        }
)
public class SampleApplicationConfiguration2 {


}
