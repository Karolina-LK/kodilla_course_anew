package com.kodilla.kodillacourseanew;


    public class Calculator {
        public int addAToB(int a, int b) {
            return a + b;
        }
        public int substractAFromB(int a, int b) {
            return a - b;
        }


        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            int result = calculator.substractAFromB(10, 5);
            int result2 = calculator.addAToB(10,5);
            System.out.println("Substracting: " + result + "\n" + "Adding: " + result2);
        }
    }
