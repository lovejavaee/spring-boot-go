package com.example.logger.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chirs on 1/15/2017.
 */
public class LogHelper {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public void helpMethod(){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
    }
}
