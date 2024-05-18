package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface CurrencyRateProviderController {

    @GetMapping("/getRate")
    double getCurrencyRate();
}