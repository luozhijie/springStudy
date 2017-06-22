package com.lzj.springtest5.setterDI;

import com.lzj.springtest5.setterDI.helper.OutPutHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lzj/springtest5/setterDI/config/beans.xml");
        OutPutHelper outPutHelper = (OutPutHelper) applicationContext.getBean("outPutHelper");
        outPutHelper.generateOutput();
    }
}
