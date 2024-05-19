package org.example.controller.impl;

import org.example.controller.RatePrinterController;
import org.example.service.RatePrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate")
public class RatePrinterControllerImpl implements RatePrinterController {
    @Autowired
    private RatePrinterService ratePrinterService;

    @Override
    public void ratePrint() {
        ratePrinterService.printRate();
    }
}
