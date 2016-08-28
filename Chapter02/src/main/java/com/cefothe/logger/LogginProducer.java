package com.cefothe.logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

/**
 * Created by cefothe on 28.08.16.
 */
public class LogginProducer {

    @Produces
    public Logger produceLogger(InjectionPoint injectionPoint){
        return  Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
}
