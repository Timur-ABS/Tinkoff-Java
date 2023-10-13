package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Task0 {
    private final static Logger LOGGER = LogManager.getLogger();

    private Task0() {
        // Private constructor to prevent instantiation
    }

    /**
     * The main method to start the program.
     * It logs a welcome message.
     */
    public static void main(String[] args) {
        LOGGER.info("Hello and welcome!");
    }
}
