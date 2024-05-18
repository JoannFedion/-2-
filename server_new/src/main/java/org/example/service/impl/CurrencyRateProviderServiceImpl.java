package org.example.service.impl;

import org.example.service.CurrencyRateProviderService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CurrencyRateProviderServiceImpl implements CurrencyRateProviderService {

    private final Random randomValue = new Random();
    @Override
    public double getCurrencyRate() {
        return randomValue.nextDouble(70, 90);
    }
}
