package com.codex.SpringBootDay03;


import org.springframework.stereotype.Component;

@Component("strawberrySyrup")
public class StrawberrySyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Getting strawberry syrup");
    }
}
