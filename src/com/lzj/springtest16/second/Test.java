package com.lzj.springtest16.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest16/second/beans.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService.toString());
    }
}
