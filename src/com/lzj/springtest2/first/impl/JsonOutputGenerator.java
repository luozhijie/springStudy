package com.lzj.springtest2.first.impl;

import com.lzj.springtest2.first.IOutputGenerator;

public class JsonOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("Json Output Generator");
    }
}
