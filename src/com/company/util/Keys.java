package com.company.util;

import java.util.Map;
import java.util.HashMap;

public class Keys {
    private Map<String, Integer> map = new HashMap();
    public Keys() {
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);

    }

    public Map<String, Integer> getMap() {
        return this.map;
    }
}
