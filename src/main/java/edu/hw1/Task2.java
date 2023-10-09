package edu.hw1;

public final class Task2 {
    public static int countDigits(int number) {
        int result = 1;
        while (number > 9 || number < -9) {
            result += 1;
            number /= 10;
        }
        return result;
    }
}
