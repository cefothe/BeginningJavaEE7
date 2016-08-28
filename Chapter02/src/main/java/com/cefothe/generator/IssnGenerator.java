package com.cefothe.generator;

import com.cefothe.interceptor.Loggable;
import com.cefothe.qualifier.EightDigits;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by cefothe on 28.08.16.
 */
@EightDigits
public class IssnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN:" + issn);
        return  issn;
    }
}
