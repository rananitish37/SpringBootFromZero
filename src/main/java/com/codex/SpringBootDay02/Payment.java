package com.codex.SpringBootDay02;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Payment {
    public void pay(){
        System.out.println("Paying....");
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("Before Payment..");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("After Payment done... ");
    }
}
