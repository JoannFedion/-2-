package org.example.service.impl;

import org.example.utils.RestRequest;
import org.example.service.RatePrinterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RatePrinterServiceImpl implements RatePrinterService {
    @Value("${currencyRateProvider.url}")
    private String server;

    @Value("${currencyRateProvider.name}")
    private String serverName;

    @Override
    public void printRate() {
        while (true) {
            System.out.printf("Try to make GET request to %s with address %s", serverName, server);
            ResponseEntity<String> response = RestRequest.makeGETRequestTo(server, String.class);
            System.out.println("get response from " + serverName + ". Current rate is " + response.getBody());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
