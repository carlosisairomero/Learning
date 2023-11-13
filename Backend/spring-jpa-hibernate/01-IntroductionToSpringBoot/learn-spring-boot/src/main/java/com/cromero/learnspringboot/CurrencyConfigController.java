package com.cromero.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigController {

    @Autowired
    private CurrencyServiceConfig serviceConfig;

    @RequestMapping("/currency-config")
    public CurrencyServiceConfig findCurrencyServiceConfig() {
        return serviceConfig;
    }
}
