package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(" ABC ", "PoemTitle", ((decoration, textToDecorate) -> decoration + textToDecorate + decoration));
        poemBeautifier.beautify("", "PoemTitle", ((decoration, textToDecorate) -> decoration + textToDecorate.toUpperCase()));
        poemBeautifier.beautify("~~", "  PoemTitle  ", ((decoration, textToDecorate) -> decoration + textToDecorate.trim() + decoration));
        poemBeautifier.beautify("#", "PoemTitle", ((decoration, textToDecorate) -> decoration + textToDecorate + decoration));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}