package edu.hw1;

public final class Task7 {
    public static int rotateLeft(int n, int shift) {
        int bits = 32;
        shift = shift % bits;
        return (n << shift) | (n >>> (bits - shift));
    }

    public static int rotateRight(int n, int shift) {
        int bits = 32;
        shift = shift % bits;
        return (n >>> shift) | (n << (bits - shift));
    }
}
