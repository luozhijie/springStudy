package com.lzj.springtest12.third;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerService{
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Init method after properties are set : " + message);
    }

    @PreDestroy
    public void cleanup() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }
}
