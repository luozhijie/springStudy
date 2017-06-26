package com.lzj.spring_aspectj2;

import org.springframework.stereotype.Component;

@Component("perf")
public class Perf implements Performance {
    @Override
    public void perform() {
        System.out.println("per");
    }
}
