package com.lzj.springtest5.constructorDI.impl;

import com.lzj.springtest5.constructorDI.IOutputGenerator;

public class JsonOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("This is Json Output Generator");
    }
}
