package org.example.controller.impl;

import org.example.controller.CurrencyRateProviderController;
import org.example.service.CurrencyRateProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencyRate")
public class CurrencyRateProviderControllerImpl implements CurrencyRateProviderController {
    @Autowired
    private CurrencyRateProviderService currencyRateProviderService;
    @Override
    public double getCurrencyRate() {
        return currencyRateProviderService.getCurrencyRate();
    }
}
