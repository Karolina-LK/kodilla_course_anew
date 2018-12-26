package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int result = calculator.substractAFromB(10, 5);
        int result2 = calculator.addAToB(10,5);

        System.out.println("Substracting: " + result + "\n" + "Adding: " + result2);


        if (result == 5){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (result2 == 15){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }

}
