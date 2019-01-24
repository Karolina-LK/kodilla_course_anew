package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify (String decoration, String textToDecorate, PoemDecorator poemDecorator) {
        String decoratedText = poemDecorator.decorate(decoration, textToDecorate);
        System.out.println("Text after decoration: " + decoratedText);
        //czy return mi tu potrzebny, skoro mam System.out.println?
        return decoratedText;
    }
}
