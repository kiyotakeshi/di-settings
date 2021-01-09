package com.kiyotakeshi.javaConfig.beans;

public class Bean1 {

    private final Bean2 bean2;
    private final Bean3 bean3;

    public Bean1(Bean2 bean2, Bean3 bean3) {
        this.bean2 = bean2;
        this.bean3 = bean3;
        System.out.println(this.getClass().getSimpleName() + "::constructor");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
