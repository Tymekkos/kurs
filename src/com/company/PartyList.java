package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyList {
    private List<String> guests = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuest() {
        System.out.println("podaj imie goscia");
        String name = scanner.nextLine();
        guests.add(name);
    }

    public void displayGuests(){
        for(String guest : guests){
            System.out.println(guest);
        }
    }
}
