package com.company;

import java.util.*;

public class HashMap {
    public void hashMap() {
    Map<String, String> nameToMeal = new java.util.HashMap<>();

    System.out.println("ulubione dania");

    nameToMeal.put("maciek", "pizza");
    nameToMeal.put("tomek", "jajecznica");
    nameToMeal.put("kosi", "lazania");
    nameToMeal.put("maciek", "pasta");
    System.out.println(nameToMeal.containsKey("maciek"));
    System.out.println(nameToMeal.containsValue("lazania"));
    //nameToMeal.clear();
    System.out.println(nameToMeal.isEmpty());

        Collection<String> values = nameToMeal.values();
        for(String value : values){
            System.out.println(value);
        }
    }
}
