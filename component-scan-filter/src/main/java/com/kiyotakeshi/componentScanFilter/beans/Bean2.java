package com.kiyotakeshi.componentScanFilter.beans;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {
    public Bean2() {
        System.out.println(this.getClass().getSimpleName() + "::constructor");
    }
}
