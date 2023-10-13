package edu.hw1;

import org.jetbrains.annotations.NotNull;

public final class Task5 {
    private static final int BASE_9 = 9;
    private static final int BASE_10 = 10;
    private static final int BASE_100 = 100;

    private Task5() {
    }

    public static @NotNull Boolean isPalindromeDescendant(int num) {
        int number = num;
        if (number <= BASE_9) {
            return true;
        }
        while (number > BASE_9) {
            if (isPalindrome(number)) {
                return true;
            }
            number = getDescendant(number);
        }
        return false;
    }

    private static int getDescendant(int num) {
        int number = num;
        int descendant = 0;
        while (number > BASE_9) {
            int lastDigit = number % BASE_10;
            number /= BASE_10;
            int secondLastDigit = number % BASE_10;
            number /= BASE_10;

            int sum = lastDigit + secondLastDigit;
            if (sum <= BASE_9) {
                descendant = (descendant * BASE_10) + sum;
            } else {
                descendant = (descendant * BASE_100) + sum;
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
