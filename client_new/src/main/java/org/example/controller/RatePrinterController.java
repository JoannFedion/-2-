package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface RatePrinterController {

    @GetMapping("/print")
    void ratePrint();
}
