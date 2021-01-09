package com.kiyotakeshi.componentScanFilter;

import com.kiyotakeshi.componentScanFilter.beans.Bean1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        // basePackages = "com.kiyotakeshi.componentScanFilter.beans"
        basePackageClasses = Bean1.class,
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Bean.*"),
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Bean1.*")
)
public class AppConfig {
}
