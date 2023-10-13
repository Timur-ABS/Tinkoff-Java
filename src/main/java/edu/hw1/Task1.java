package edu.hw1;

import org.jetbrains.annotations.NotNull;

public final class Task1 {
    private static final int SECONDS_IN_A_MINUTE = 60;

    private Task1() {
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
