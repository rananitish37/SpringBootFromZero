package com.codex.SpringBootDay03;

import org.springframework.stereotype.Component;

@Component("strawberryFrosting")
public class StrawberryFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Getting Strawberry Frosting");
    }
}
