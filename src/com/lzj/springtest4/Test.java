package com.lzj.springtest4;

import com.lzj.springtest4.config.AppConfig;
import com.lzj.springtest4.core.CustomerBo;
import com.lzj.springtest4.core.SchedulerBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerBo customerBo = (CustomerBo) applicationContext.getBean("customerBo");
        customerBo.printMsg("A");
        SchedulerBo schedulerBo = (SchedulerBo) applicationContext.getBean("schedulerBo");
        schedulerBo.printMsg("B");
    }
}
