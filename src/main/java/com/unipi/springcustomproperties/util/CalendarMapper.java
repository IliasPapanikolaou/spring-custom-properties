package com.unipi.springcustomproperties.util;

import java.util.HashMap;
import java.util.Properties;
import java.util.stream.Collectors;

public class CalendarMapper {

    public static HashMap<String, String> streamConverter(Properties properties) {
        return properties.entrySet().stream().collect(Collectors.toMap(
                p -> String.valueOf(p.getKey()),
                p -> String.valueOf(p.getValue()),
                (prev, next) -> next, HashMap::new
        ));
    }
}
