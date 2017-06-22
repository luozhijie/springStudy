package com.lzj.springtest2.third.impl;

import com.lzj.springtest2.third.IOutputGenerator;

public class JsonOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("Json Output Generator");
    }
}
