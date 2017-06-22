package com.lzj.springtest2.first.impl;

import com.lzj.springtest2.first.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("Csv Output Generator");
    }
}
