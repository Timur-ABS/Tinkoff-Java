package edu.hw1;

import java.util.Arrays;

public final class Task6 {
    private static final int KAPREKAR_CONSTANT = 6174;

    public static int countK(int number) {
        if (number == KAPREKAR_CONSTANT) {
            return 0;
        } else {
            return 1 + countK(countKInternal(number));
        }
    }

    public static int countKInternal(int number) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = number % 10;
            number /= 10;
        }
        Arrays.sort(arr);
        int number1 = 0, number2 = 0;
        for (int i = 0; i < 4; ++i) {
            number1 = number1 * 10 + arr[i];
            number2 = number2 * 10 + arr[3 - i];
        }
        return number2 - number1;
    }
}
