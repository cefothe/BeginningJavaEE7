package com.cefothe.service;

import com.cefothe.book.Book;
import com.cefothe.generator.NumberGenerator;
import com.cefothe.qualifier.ThirtennDigits;

import javax.inject.Inject;

/**
 * Created by cefothe on 28.08.16.
 */
public class BookService {

    @Inject
    @ThirtennDigits
    NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description){
        Book book = new Book(title,price,description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }
}
