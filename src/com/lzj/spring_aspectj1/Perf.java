package com.lzj.spring_aspectj1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("perf")
public class Perf implements Performance {
    @Override
    public void perform() {
        System.out.println("per");
    }
}
