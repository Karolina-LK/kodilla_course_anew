package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }



    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        //nie wie, czemu mu sie nie podoba variable ArrayList
        //i nie do końca rozumiem ideę tej metody tu; czemu mamy niejako dwie listy uzytkownikow ksiazek, tu i w interfejsie
        List<Book> bookList = new ArrayList<Book>();
        bookList = libraryDatabase.listBooksInHandsOf(libraryUser);
        return bookList;
    }

}