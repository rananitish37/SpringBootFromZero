package com.codex.SpringBootDay01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDay01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDay01Application.class, args);
	}
//	@Autowired
//	SendNotification sendNotification;

	final SendNotification sendNotification;

//	public SpringBootDay01Application(@Qualifier("smsNotif") SendNotification sendNotification){
//		this.sendNotification = sendNotification;
//	}
	public SpringBootDay01Application( SendNotification sendNotification){
		this.sendNotification = sendNotification;
	}

	@Override
	public void run(String... args) throws Exception {
//		sendNotification = new emailNotification();
//		sendNotification.notification();
		sendNotification.notification();
	}
}
