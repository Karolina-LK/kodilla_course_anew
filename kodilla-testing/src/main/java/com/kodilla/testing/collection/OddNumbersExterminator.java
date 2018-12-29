package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    static ArrayList<Integer> exterminate(ArrayList<Integer> allNumbers) {
    //czy dobrze rozumiem, ze metoda exterminate -wycina- z pierwszej listy, czyli allNumbers, listę tu nazwaną even,
         // czyli nazwa listy allNumbers powina pojawic sie i w main, i tutaj?
        //slowo static narzuca mi program
        ArrayList<Integer> even = new ArrayList<>();

        for (Integer number : allNumbers) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                System.out.println("Entered number cannot be joined to the scope");
            }
        }

        System.out.println("The chosen even numbers are as follows:" + even);
        return even;
    }
}

class Number {

    public static void main (String[] args) throws java.lang.Exception {

        ArrayList<Integer> allNumbers = new ArrayList<Integer>();
        allNumbers.add(250);
        allNumbers.add(197);
        allNumbers.add(170);
        allNumbers.add(169);
        allNumbers.add(20);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(allNumbers);
    }
}
