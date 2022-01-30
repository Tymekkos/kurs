package com.company;

import java.util.Scanner;

public class FizzBuzz {
    public void fizzBuzz() {
        for(int i=1; i<101; i++){
            if(i%15 == 0) {
                System.out.println("fizzbuzz");
            }else if(i%3 == 0){
                System.out.println("fizz");
            }else if(i%5 == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
