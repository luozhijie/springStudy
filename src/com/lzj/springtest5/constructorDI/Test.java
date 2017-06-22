package com.lzj.springtest5.constructorDI;

import com.lzj.springtest5.constructorDI.helper.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest5/constructorDI/config/beans.xml");
        OutputHelper outputHelper = (OutputHelper) applicationContext.getBean("outPutHelper");
        outputHelper.generateOutput();
    }
}
