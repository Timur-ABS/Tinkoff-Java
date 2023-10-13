package edu.hw1;

import java.util.Arrays;

public final class Task6 {
    private static final int KAPREKAR_CONSTANT = 6174;
    private static final int ARRAY_SIZE = 4;
    private static final int BASE_10 = 10;

    private Task6() {

    }

    public static int countK(int number) {
        if (number == KAPREKAR_CONSTANT) {
            return 0;
        } else {
            return 1 + countK(countKInternal(number));
        }
    }

    public static int countKInternal(int num) {
        int[] arr = new int[ARRAY_SIZE];
        int number = num;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = number % BASE_10;
            number /= BASE_10;
        }
        Arrays.sort(arr);
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < ARRAY_SIZE; ++i) {
            number1 = number1 * BASE_10 + arr[i];
            number2 = number2 * BASE_10 + arr[ARRAY_SIZE - 1 - i];
        }
        return number2 - number1;
    }
}
