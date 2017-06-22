package com.lzj.springtest1.testClass;

import com.lzj.springtest1.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/lzj/springtest1/config/applicationContext.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.printHello();
    }
}
