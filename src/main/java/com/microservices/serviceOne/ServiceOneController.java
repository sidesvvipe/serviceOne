package com.microservices.serviceOne;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @RequestMapping(value = "/is-number",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json")
    public Boolean isNumber() {
        return true;
    }
}
