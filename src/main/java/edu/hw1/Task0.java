package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Task0 {
    private final static Logger LOGGER = LogManager.getLogger();

    private Task0() {
        // Private constructor to prevent instantiation
    }

    public static void Task0Logger() {
        LOGGER.info("Hello and welcome!");
    }

}

