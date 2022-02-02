package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyList {
    private List<Guest> guests = new ArrayList<>();
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
    }

    public void displayGuests(){
        for(Guest guest : guests){
            guest.guestInformation();
        }
    }
}
