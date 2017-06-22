package com.lzj.springtest3;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void printHelloWorld(String msg) {
        System.out.println("Hello : " + msg);
    }
}
