package com.microservices.serviceOne;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @RequestMapping(value = "/is-number",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Car isNumber() {
        return new Car();
//        return false;
    }
}

class Car {
    public int wheels = 4;
    public int doors = 2;
    public String color = "red";
    public String status = "OK";
}
