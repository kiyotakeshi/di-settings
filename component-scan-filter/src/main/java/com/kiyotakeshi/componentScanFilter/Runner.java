package com.kiyotakeshi.componentScanFilter;

import com.kiyotakeshi.componentScanFilter.beans.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        // var bean1 = context.getBean(Bean1.class);
        // bean1.sayHello();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
