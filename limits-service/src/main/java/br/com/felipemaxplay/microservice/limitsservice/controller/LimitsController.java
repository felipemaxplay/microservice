package br.com.felipemaxplay.microservice.limitsservice.controller;

import br.com.felipemaxplay.microservice.limitsservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/limits")
public class LimitsController {

    @GetMapping
    public Limits retrieveLimits() {
        return new Limits(1, 1000);
    }
}
