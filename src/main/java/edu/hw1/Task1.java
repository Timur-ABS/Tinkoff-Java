package edu.hw1;

import java.util.Scanner;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

public final class Task1 {
    private static final int SECONDS_IN_A_MINUTE = 60;
    private static final Logger LOGGER = Logger.getLogger(Task1.class.getName());

    private Task1() {
    }

    /**
     * Entry point for the Task1 program.
     * This method prompts the user to input a time string in the format "minutes:seconds".
     * It then converts this string to total seconds and logs the result using the LOGGER.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int result = convertMinutesToSeconds(string);
        LOGGER.info(String.valueOf(result));
    }

    public static int convertMinutesToSeconds(@NotNull String input) {
        String[] parts = input.split(":");
        if (parts.length != 2) {
            return -1;
        }
        int minutes = convertStringToInt(parts[0]);
        int seconds = convertStringToInt(parts[1]);

        if (minutes == -1 || seconds == -1 || seconds >= SECONDS_IN_A_MINUTE) {
            return -1;
        }
        return minutes * SECONDS_IN_A_MINUTE + seconds;
    }

    private static int convertStringToInt(@NotNull String string) {
        if (string.isEmpty() || !isValidNumberString(string)) {
            return -1;
        }
        return Integer.parseInt(string);
    }

    private static boolean isValidNumberString(@NotNull String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
