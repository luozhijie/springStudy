package com.lzj.springtest10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest10/beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
    }
}
