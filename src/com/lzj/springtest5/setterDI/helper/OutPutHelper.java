package com.lzj.springtest5.setterDI.helper;

import com.lzj.springtest5.setterDI.IOutputGenerator;

public class OutPutHelper {
    IOutputGenerator outputGenerator;

    public void generateOutput() {
        outputGenerator.generateOutput();
    }

    //DI via setter method
    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}
