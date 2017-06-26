package com.lzj.spring_aspectj1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConcertConfig.class);
        Performance perf = (Performance) applicationContext.getBean("perf");
        perf.perform();
    }
}
