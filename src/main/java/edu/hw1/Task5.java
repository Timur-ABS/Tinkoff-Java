package edu.hw1;

import org.jetbrains.annotations.NotNull;

public final class Task5 {
    public static @NotNull Boolean isPalindromeDescendant(int number) {
        if (number <= 9) {
            return true;
        }
        while (number > 9) {
            if (isPalindrome(number)) {
                return true;
            }
            number = getDescendant(number);
        }
        return false;
    }

    private static int getDescendant(int number) {
        int descendant = 0;
        while (number > 9) {
            int lastDigit = number % 10;
            number /= 10;
            int secondLastDigit = number % 10;
            number /= 10;

            int sum = lastDigit + secondLastDigit;
            if (sum <= 9) {
                descendant = (descendant * 10) + sum;
            } else {
                descendant = (descendant * 100) + sum;
            }
        }
        return descendant;
    }

    public static Boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        int length = strNumber.length();
        for (int i = 0; i < length / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
