package com.kodilla.stream.beautifier;

public interface PoemDecorator {
//rozumiem, że tekst jest argumentem - decoratedText, plus to, co z tekstem robię, czyli decoration
    String decorate (String decoration, String textToDecorate);
}
