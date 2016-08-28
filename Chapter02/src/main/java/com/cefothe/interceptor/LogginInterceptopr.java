package com.cefothe.interceptor;

import com.cefothe.interceptor.Loggable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

/**
 * Created by cefothe on 28.08.16.
 */
@Interceptor
@Loggable
public class LogginInterceptopr {

    @Inject
    private Logger logger;

    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws  Exception{
        logger.entering(ic.getTarget().getClass().getName(),ic.getMethod().getName());
        try{
            return ic.proceed();
        }finally {
            logger.exiting(ic.getTarget().getClass().getName(),ic.getMethod().getName());
        }
    }
}
