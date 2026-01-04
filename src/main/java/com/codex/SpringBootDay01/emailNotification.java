package com.codex.SpringBootDay01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
//@Qualifier("emailNotif")
@ConditionalOnProperty(name = "notification.type", havingValue = "email")
public class emailNotification implements SendNotification{
    @Override
    public void notification() {
        System.out.println("Notifying through Email");
    }
}
