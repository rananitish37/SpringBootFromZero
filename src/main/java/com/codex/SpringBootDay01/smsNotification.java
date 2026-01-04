package com.codex.SpringBootDay01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

//@Primary
@Component
//@Qualifier("smsNotif")
@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class smsNotification implements SendNotification{
    @Override
    public void notification() {
        System.out.println("Notifying through SMS");
    }
}
