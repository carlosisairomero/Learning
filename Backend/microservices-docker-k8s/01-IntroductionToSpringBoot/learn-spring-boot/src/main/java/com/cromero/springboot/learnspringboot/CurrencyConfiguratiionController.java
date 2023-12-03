package com.cromero.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfiguratiionController {

    @Autowired
    private CurrencyConfiguration currencyConfiguration;

    @RequestMapping("/currency-configuration")
    public CurrencyConfiguration retrieveCurrencies() {
        return currencyConfiguration;
    }

}
