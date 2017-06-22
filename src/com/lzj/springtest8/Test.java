package com.lzj.springtest8;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest8/beans.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        customerService.setMessage("aaaaaaaaaaaa");
        System.out.println(customerService.getMessage());
        CustomerService customerService1 = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService1.getMessage());
    }
}
