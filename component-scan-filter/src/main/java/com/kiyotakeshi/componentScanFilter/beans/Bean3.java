package com.kiyotakeshi.componentScanFilter.beans;

import org.springframework.stereotype.Component;

@Component
public class Bean3 {
    public Bean3() {
        System.out.println(this.getClass().getSimpleName() + "::constructor");
    }
}
