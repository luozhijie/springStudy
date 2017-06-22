package com.lzj.springtest2.third.Helper;

import com.lzj.springtest2.second.IOutputGenerator;
import com.lzj.springtest2.second.impl.CsvOutputGenerator;

public class OutputHelper {
    IOutputGenerator outputGenerator;

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
