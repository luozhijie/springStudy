package com.lzj.springtest2.second.Helper;

import com.lzj.springtest2.second.IOutputGenerator;
import com.lzj.springtest2.second.impl.CsvOutputGenerator;

public class OutputHelper {
    IOutputGenerator outputGenerator;

    public OutputHelper() {
        outputGenerator = new CsvOutputGenerator();
    }

    public void generateOutput() {
        outputGenerator.generateOutput();
    }
}
