package com.lzj.springtest5.constructorDI.helper;

import com.lzj.springtest5.constructorDI.IOutputGenerator;

public class OutputHelper {
    IOutputGenerator outputGenerator;

    public void generateOutput() {
        outputGenerator.generateOutput();
    }

    //DI via constructor
    public OutputHelper(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
