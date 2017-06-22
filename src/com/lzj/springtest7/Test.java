package com.lzj.springtest7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest7/beans.xml");
        Customer customer = (Customer) applicationContext.getBean("customer");
        System.out.println(customer.toString());;
    }
}
