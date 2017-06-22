package com.lzj.springtest2.third.impl;

import com.lzj.springtest2.third.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("Csv Output Generator");
    }
}
