package com.company;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class PartyList {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> guestNumber = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuest() {
        System.out.println("podaj imie goscia");
        String name = scanner.nextLine();

        System.out.println("podaj preferowany posilek");
        String meal = scanner.nextLine();

        System.out.println("podaj numer telefonu");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("czy weganin (y/n)");
        String veganString = scanner.nextLine();

        boolean vegan;

        if(veganString.equals("y") || veganString.equals("Y")){
            vegan = true;
        }else{
            vegan = false;
        }

        Guest guest = new Guest(name, meal, number, vegan);
        guests.add(guest);
        meals.add(meal);
        guestNumber.put(number, guest);
        guests.add(guest);
    }

    public void displayMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber(){
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = guestNumber.get(guestNumber);
        guest.guestInformation();
    }

    public void displayGuests(){
        for(Guest guest : guests){
            guest.guestInformation();
        }
    }
}
