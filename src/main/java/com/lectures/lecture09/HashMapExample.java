package com.lectures.lecture09;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kiril", 10);
        map.put("Elena", 12);

        System.out.println(map.size());

        if(map.containsKey("Kiril")){
            Integer a = map.get("Kiril");
            System.out.println("Kiril has value : " + a);
        if(map.containsKey("Elena")){
            Integer a = map.get("Elena");
            System.out.println("Elena has value: " + a);
        }

        for(Map.Entry<String, Integer> map1: map.entrySet()){
            System.out.println("key: " + map1.getKey() + "... value: " + map1.getValue());
        }
    }
}
