package com.lzj.springtest14.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest14/first/beans.xml");
        Customer customer = (Customer) applicationContext.getBean("customerBean");
        System.out.println(customer.toString());
    }
}
