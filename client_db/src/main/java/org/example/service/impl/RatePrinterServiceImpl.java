package org.example.service.impl;

import org.example.entity.Exchange;
import org.example.repository.ExchangeRateRepository;
import org.example.service.RatePrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RatePrinterServiceImpl implements RatePrinterService {

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    @Scheduled(fixedDelay = 5000)
    @Override
    public void printRate() {
        Exchange exchange = exchangeRateRepository.findById(1).orElseThrow(
                () -> new RuntimeException("Обменный курс не найден")
        );
        System.out.println("get response from db" + ". Current rate is " + exchange.getExchangeRate());

    }
}
