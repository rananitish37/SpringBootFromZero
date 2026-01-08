package com.codex.SpringBootDay03;

import org.springframework.stereotype.Component;

@Component("chocolateFrosting")
public class ChocolateFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Getting chocolate frosting");
    }
}
