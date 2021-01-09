package com.kiyotakeshi.javaConfig;

import com.kiyotakeshi.javaConfig.beans.Bean1;
import com.kiyotakeshi.javaConfig.beans.Bean2;
import com.kiyotakeshi.javaConfig.beans.Bean3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Bean1 bean1(Bean2 bean2, Bean3 bean3){
        return new Bean1(bean2, bean3);
    }

    @Bean
    public Bean2 bean2(){
        return new Bean2();
    }

    @Bean
    public Bean3 bean3(){
        return new Bean3();
    }
}
