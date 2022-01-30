package com.company;

import java.util.Scanner;

public class Imie {
    public void sprawdzImie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj imie");
        String name = scanner.nextLine();

        //System.out.println("serwus " + name);
        if(!name.isEmpty() && (!name.endsWith("a") || name.equals("barnaba") || name.equals("Barnaba") || name.equals("kuba") || name.equals("Kuba"))) {
            System.out.println("jestes facet");
        }else if(!name.isEmpty() && name.endsWith("a")) {
            System.out.println("jestes baba");
        }else{
            System.out.println("imie nie moze byc puste");
        }
    }
}
