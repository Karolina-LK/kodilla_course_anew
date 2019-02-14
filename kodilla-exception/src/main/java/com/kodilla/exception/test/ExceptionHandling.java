package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();
        // wartosc ponizej, zeby upewnic sie, ze obliczy sie 'bez wyjatku'
        //double x = 1.5;
        double x = 2.0;
        double y = 3.0;

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(x, y));

        } catch (Exception e) {

            System.out.println("This combination not acceptable. ");
        }

    }
}