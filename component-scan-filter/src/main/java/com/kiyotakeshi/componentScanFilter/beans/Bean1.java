package com.kiyotakeshi.componentScanFilter.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bean1 {

    private final Bean2 bean2;
    private final Bean3 bean3;

    public Bean1(Bean2 bean2, Bean3 bean3) {
        this.bean2 = bean2;
        this.bean3 = bean3;
        System.out.println(this.getClass().getSimpleName() + "::constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(String.format("%s postConstruct with %s and %s",
                getClass().getSimpleName(),
                bean2.getClass().getSimpleName(),
                bean3.getClass().getSimpleName()
        ));
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
