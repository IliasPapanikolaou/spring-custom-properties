package com.unipi.springcustomproperties.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.util.Map;

@ConfigurationProperties(prefix = "calendar")
@ConfigurationPropertiesScan
public class ConfigProperties {

    private Map<Integer, String> month;
    private Map<Integer, String> day;

    public Map<Integer, String> getMonth() {
        return month;
    }

    public void setMonth(Map<Integer, String> month) {
        this.month = month;
    }

    public Map<Integer, String> getDay() {
        return day;
    }

    public void setDay(Map<Integer, String> day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "ConfigProperties{" +
                "month=" + month +
                ", day=" + day +
                '}';
    }
}
