package com.company;

import java.util.Scanner;

public class Party {
    public void party() {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        PartyList partyList = new PartyList();

        while(shouldContinue) {
            System.out.println("Wybierz opcje");
            System.out.println("1. wyswietl gosci");
            System.out.println("2. dodaj goscia");
            System.out.println("3. wyswietl potrawy");
            System.out.println("4. znajdz po nr tel");
            System.out.println("5. wyjscie");

            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1 -> partyList.displayGuests();
                case 2 -> partyList.addGuest();
                case 3 -> partyList.displayMeals();
                case 4 -> partyList.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;
            }
        }
    }
}
