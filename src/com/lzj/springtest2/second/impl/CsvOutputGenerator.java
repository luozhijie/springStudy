package com.lzj.springtest2.second.impl;

import com.lzj.springtest2.second.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("Csv Output Generator");
    }
}
