package br.com.felipemaxplay.microservice.limitsservice.controller;

import br.com.felipemaxplay.microservice.limitsservice.bean.Limits;
import br.com.felipemaxplay.microservice.limitsservice.config.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/limits")
public class LimitsController {

    private Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//        return new Limits(1, 1000);
    }
}
