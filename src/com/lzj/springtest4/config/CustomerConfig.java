package com.lzj.springtest4.config;

import com.lzj.springtest4.core.CustomerBo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Bean(name = "customerBo")
    public CustomerBo customerBo(){
        return new CustomerBo();
    }
}
