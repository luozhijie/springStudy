package com.lzj.springtest2.third.test;

import com.lzj.springtest2.third.Helper.OutputHelper;
import com.lzj.springtest2.third.IOutputGenerator;
import com.lzj.springtest2.third.impl.CsvOutputGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext( "com/lzj/springtest2/third/config/beans.xml");
//        OutputHelper outputHelper = (OutputHelper) applicationContext.getBean("outPutHelper");


        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"com/lzj/springtest2/third/config/beans.xml"});
        OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
        output.generateOutput();
    }
}
