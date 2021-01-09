package com.kiyotakeshi.javaConfig;

import com.kiyotakeshi.javaConfig.beans.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var bean1 = context.getBean(Bean1.class);
        bean1.sayHello();
    }
}
