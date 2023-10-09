package edu.hw1;

import java.util.Scanner;

public final class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int result = minutesToSeconds(string);
        System.out.println(result);
    }

    public static int minutesToSeconds(String input) {
        String[] parts = input.split(":");
        if (parts.length != 2) {
            return -1;
        }
        int minutes = isCorrectStringToInt(parts[0]), second = isCorrectStringToInt(parts[1]);
        if(minutes == -1 || second == -1 || second >= 60){
            return -1;
        }
        return minutes * 60 + second;
    }
    public static int isCorrectStringToInt(String string){
        if (string.isEmpty()){
            return -1;
        }
        int cur = 0;
        for(int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if(!Character.isDigit(c)){
                return -1;
            }
            cur *= 10;
            cur += c - '0';
        }
        return cur;
    }
}


