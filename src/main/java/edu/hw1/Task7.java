package edu.hw1;

public final class Task7 {
    public static int rotateLeft(int n, int shift) {
        StringBuilder str = intToBinStr(n), newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt((i + shift) % str.length()));
        }
        return strBinToInt(newStr);
    }

    public static int rotateRight(int n, int shift) {
        StringBuilder str = intToBinStr(n), newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt((str.length() + i - shift) % str.length()));
        }
        return strBinToInt(newStr);
    }

    public static StringBuilder intToBinStr(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            if (n % 2 == 1) {
                result.append('1');
            } else {
                result.append('0');
            }
            n /= 2;
        }
        return result.reverse();
    }

    public static int strBinToInt(StringBuilder s) {
        s.reverse();
        int result = 0, cur = 1;
        for (int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - '0') * cur;
            cur *= 2;
        }
        return result;
    }

}
