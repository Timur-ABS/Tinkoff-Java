package edu.hw1;

import java.util.Scanner;

public final class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int result = convertMinutesToSeconds(string);
        System.out.println(result);
    }

    public static int convertMinutesToSeconds(String input) {
        String[] parts = input.split(":");
        if (parts.length != 2) {
            return -1;
        }
        int minutes = convertStringToInt(parts[0]);
        int seconds = convertStringToInt(parts[1]);

        if (minutes == -1 || seconds == -1 || seconds >= 60) {
            return -1;
        }
        return minutes * 60 + seconds;
    }

    private static int convertStringToInt(String string) {
        if (string.isEmpty() || !isValidNumberString(string)) {
            return -1;
        }
        return Integer.parseInt(string);
    }

    private static boolean isValidNumberString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
