package edu.hw1;

public final class Task4 {
    public static String fixString(String s) {
        if (s == null) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 < s.length()) {
                result.append(s.charAt(i + 1));
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
