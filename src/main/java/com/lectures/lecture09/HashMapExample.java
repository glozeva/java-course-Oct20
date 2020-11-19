package com.lectures.lecture09;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kiril", 10);
        map.put("Elena", 12);

        System.out.println(map.size());

        if(map.containsKey("Kiril")) {
            Integer a = map.get("Kiril");
            log.info("Kiril has value: {}", a);
        }
        if(map.containsKey("Elena")){
            Integer b = map.get("Elena");
            log.warn("Elena has value: {}", b);
        }

        for(Map.Entry<String, Integer> map1: map.entrySet()){
            System.out.println("key: " + map1.getKey() + "... value: " + map1.getValue());
        }
    }
}
