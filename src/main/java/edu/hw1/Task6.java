package edu.hw1;

import java.util.Arrays;

public final class Task6 {
    public static int countK(int number) {
        if (number == 6174) {
            return 0;
        } else {
            return 1 + countK(K(number));
        }
    }

    public static int K(int number) {
        int[] arr = {number % 10, number / 10 % 10, number / 100 % 10, number / 1000};
        Arrays.sort(arr);
        int number1 = 0, number2 = 0;
        for (int i = 0; i < 4; ++i) {
            number1 *= 10;
            number2 *= 10;
            number1 += arr[i];
            number2 += arr[3 - i];
        }
        return number2 - number1;
    }
}
