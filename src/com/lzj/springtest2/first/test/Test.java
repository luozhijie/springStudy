package com.lzj.springtest2.first.test;

import com.lzj.springtest2.first.IOutputGenerator;
import com.lzj.springtest2.first.impl.CsvOutputGenerator;

public class Test {
    @org.junit.Test
    public void test(){
        IOutputGenerator output = new CsvOutputGenerator();
        output.generateOutput();
    }
}
