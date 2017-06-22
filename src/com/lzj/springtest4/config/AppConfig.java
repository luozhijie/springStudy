package com.lzj.springtest4.config;

import com.lzj.springtest4.core.SchedulerBo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CustomerConfig.class, SchedulerConfig.class})
public class AppConfig {
}
