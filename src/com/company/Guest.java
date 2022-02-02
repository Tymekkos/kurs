package com.company;

public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void guestInformation(){
        System.out.println("imie: " + name);
        System.out.println("ulubiony posilek: " + meal);
        System.out.println("numer tel: " + phoneNumber);
        String vegan = isVegan ? "tak" : "nie";
        System.out.println("weganin?" + vegan);
    }
}
