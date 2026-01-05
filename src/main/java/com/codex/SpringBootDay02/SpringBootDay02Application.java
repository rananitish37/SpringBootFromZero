package com.codex.SpringBootDay02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDay02Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDay02Application.class, args);
	}

	final Payment payment;

	public SpringBootDay02Application(Payment payment){
		this.payment=payment;
	}

	@Override
	public void run(String... args) throws Exception {
		payment.pay();
	}
}
