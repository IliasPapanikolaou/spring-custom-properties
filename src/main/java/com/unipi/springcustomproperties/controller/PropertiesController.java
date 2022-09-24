package com.unipi.springcustomproperties.controller;

import com.unipi.springcustomproperties.model.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PropertiesController {

    @Autowired
    ConfigProperties configProperties;

    @GetMapping("/months")
    public Map<Integer, String> getMonths() {
        return  configProperties.getMonth();
    }

    @GetMapping("/days")
    public Map<Integer, String> getDays() {
        return  configProperties.getDay();
    }
}
