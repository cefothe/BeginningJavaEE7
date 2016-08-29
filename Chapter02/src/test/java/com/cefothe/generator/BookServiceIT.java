package com.cefothe.generator;

import com.cefothe.book.Book;
import com.cefothe.service.BookService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by stefanangelov on 8/29/16.
 */
public class BookServiceIT {

    @Test
    public void shouldCheckNumberIsMock(){

        Weld weld = new Weld();
        // with 2.2 weld treats the two beans.xml files a two separate archives. To have test alternative override that
        // we need to switch off this feature
        System.setProperty(Weld.ARCHIVE_ISOLATION_SYSTEM_PROPERTY, "false");

        WeldContainer weldContainer = weld.initialize();
        BookService bookService = weldContainer.instance().select(BookService.class).get();

        Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");

        assertTrue(book.getNumber().startsWith("MOCK"));

        weld.shutdown();

    }
}
