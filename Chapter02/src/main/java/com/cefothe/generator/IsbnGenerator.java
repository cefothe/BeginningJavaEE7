package com.cefothe.generator;

import com.cefothe.interceptor.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by cefothe on 28.08.16.
 */
public class IsbnGenerator implements  NumberGenerator {

    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String isbn = "13-84356-"+ Math.abs(new Random().nextInt());
        logger.info("Generated ISBN: "+ isbn);
        return  isbn;
    }
}
