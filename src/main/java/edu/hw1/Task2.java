package edu.hw1;

public final class Task2 {
    private static final int BASE_10 = 10;
    private static final int BASE_9 = 9;
    private static final int BASE_1 = 1;

    private Task2() {

    }

    public static int countDigits(int number) {
        int tempNumber = number;
        int result = 1;
        while (tempNumber > BASE_9 || tempNumber < -BASE_9) {
            result += BASE_1;
            tempNumber /= BASE_10;
        }
        return result;
    }
}
