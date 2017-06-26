package com.lzj.spring_aspectj1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class Audience {

    @Pointcut("execution(* com.lzj.spring_aspectj1.Performance.perform())")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("silenceCellPhones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("takeing seats");
    }

    @AfterReturning("performance()")
    public void applaues() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

}
