package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

@EnableScheduling
@SpringBootApplication
public class CurrencyRateProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CurrencyRateProviderApplication.class, args);
    }
}
