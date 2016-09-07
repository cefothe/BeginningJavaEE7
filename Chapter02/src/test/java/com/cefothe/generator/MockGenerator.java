package com.cefothe.generator;

import com.cefothe.interceptor.Loggable;
import com.cefothe.qualifier.ThirtennDigits;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by stefanangelov on 8/29/16.
 */
@Alternative
@ThirtennDigits
public class MockGenerator implements NumberGenerator{

    @Inject
    private Logger logger;

    @Loggable
    @Override
    public String generateNumber() {
        String mock = "MOCK-" + Math.abs(new Random().nextInt());
        logger.info("Generated Mock : " + mock);
        return mock;
    }
}
