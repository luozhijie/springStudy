package com.lzj.springtest2.second.impl;

import com.lzj.springtest2.second.IOutputGenerator;

public class JsonOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("Json Output Generator");
    }
}
