package com.lzj.springtest5.setterDI.impl;

import com.lzj.springtest5.setterDI.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("This is Csv Output Generator");
    }
}
