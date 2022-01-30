package com.company;

import java.util.Random;
import java.util.Scanner;

public class LosowanieLiczb {
    public void losowanie() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;

        while(!wasNumberGuessed){
            System.out.println("podaj liczbe: ");
            int userNumber = scanner.nextInt();
            if(userNumber > number) {
                System.out.println("mniejsza");
            }else if(userNumber < number) {
                System.out.println("wieksza");
            }else{
                System.out.println("udalo ci sie zgadnac");
                wasNumberGuessed = true;
            }
        }
    }
}
