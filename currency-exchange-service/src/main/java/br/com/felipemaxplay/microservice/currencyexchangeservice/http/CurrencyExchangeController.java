package br.com.felipemaxplay.microservice.currencyexchangeservice.http;

import br.com.felipemaxplay.microservice.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(path = "/currency-exchange")
public class CurrencyExchangeController {

    @GetMapping("/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) {
        return new CurrencyExchange(1L, from, to, BigDecimal.valueOf(65.5));
    }
}
