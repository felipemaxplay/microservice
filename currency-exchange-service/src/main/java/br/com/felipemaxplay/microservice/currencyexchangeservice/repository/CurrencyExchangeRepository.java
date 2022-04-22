package br.com.felipemaxplay.microservice.currencyexchangeservice.repository;

import br.com.felipemaxplay.microservice.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
