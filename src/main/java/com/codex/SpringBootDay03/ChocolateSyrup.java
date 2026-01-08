package com.codex.SpringBootDay03;

import org.springframework.stereotype.Component;

@Component("chocolateSyrup")
public class ChocolateSyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Getting Chocolate syrup");
    }
}
