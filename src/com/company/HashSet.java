package com.company;

import java.util.*;

public class HashSet {
    public void hashSet() {
        Set<String> meals = new java.util.HashSet<>();

        meals.add("pizza");
        meals.add("burger");
        meals.add("pizza");
        meals.add("salad");

        for(String meal : meals){
            System.out.println(meal);
        }
    }
}
