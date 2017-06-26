package com.lzj.spring_aspectj2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/spring_aspectj2/beans.xml");
        Performance perf = (Performance) applicationContext.getBean("perf");
        perf.perform();
    }
}
