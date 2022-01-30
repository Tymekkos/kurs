package com.company;

import java.util.Scanner;

public class Wiek {
    public void sprawdzWiek() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj wiek");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("jestes pelnoletni");
        }else {
            System.out.println("jestes niepelnoletni");

        }
    }
}
