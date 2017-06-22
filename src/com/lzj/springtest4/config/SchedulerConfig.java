package com.lzj.springtest4.config;

import com.lzj.springtest4.core.CustomerBo;
import com.lzj.springtest4.core.SchedulerBo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {
    @Bean(name = "schedulerBo")
    public SchedulerBo schedulerBo(){
        return new SchedulerBo();
    }
}
