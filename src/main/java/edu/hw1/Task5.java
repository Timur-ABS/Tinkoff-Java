package edu.hw1;

public final class Task5 {
    public static Boolean isPalindromeDescendant(int number) {
        if(number<= 9){
            return true;
        }
        while (number > 9) {
            if (isNumberPalindrome(number)) {
                return true;
            }
            int newNumber = 0;
            while (number != 0) {
                int cur1 = number % 10, cur2;
                number /= 10;
                cur2 = number % 10;
                number /= 10;
                if (cur1 + cur2 <= 9) {
                    newNumber *= 10;
                } else {
                    newNumber *= 100;
                }
                newNumber += cur1 + cur2;
            }
            number = newNumber;
        }
        return false;
    }

    public static Boolean isNumberPalindrome(int number) {
        String strNumber = Integer.toString(number);
        for (int i = 0; i < strNumber.length() / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(strNumber.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
