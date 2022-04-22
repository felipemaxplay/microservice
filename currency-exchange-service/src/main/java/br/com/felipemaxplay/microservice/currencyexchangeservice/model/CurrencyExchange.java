package br.com.felipemaxplay.microservice.currencyexchangeservice.model;

import io.micrometer.core.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "CURRENCY_EXCHANGES")
public class CurrencyExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "CURRENCY_FROM", nullable = false)
    private String from;
    @Column(name = "CURRENCY_TO", nullable = false)
    private String to;
    @Column(name = "CONVERSION_MULTIPLE", nullable = false)
    private BigDecimal conversionMultiple;
    @Column(name = "ENVIRONMENT", nullable = false)
    private  String environment;

    @Deprecated
    public CurrencyExchange() {
    }

    public CurrencyExchange(@NonNull Long id, @NonNull String from, @NonNull String to,
                            @NonNull BigDecimal conversionMultiple) {
        this.id = Objects.requireNonNull(id);
        this.from = Objects.requireNonNull(from);
        this.to = Objects.requireNonNull(to);
        this.conversionMultiple = Objects.requireNonNull(conversionMultiple);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
