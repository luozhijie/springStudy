package com.lzj.springtest12.second;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void Test(){
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest12/second/beans.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService.getMessage());
        try {
            applicationContext.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
