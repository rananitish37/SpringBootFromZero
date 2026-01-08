package com.codex.SpringBootDay03;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDay03Application implements CommandLineRunner {
    private final CakeBaker cakeBaker;

    public SpringBootDay03Application(CakeBaker cakeBaker){
        this.cakeBaker=cakeBaker;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDay03Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cakeBaker.bakeCake();
    }
}
