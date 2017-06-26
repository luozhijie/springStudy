package com.lzj.springtest18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest18/applicationContext.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println("*************************");
        customerService.printName();
        System.out.println("*************************");
        customerService.printURL();
        System.out.println("*************************");
    }
}
