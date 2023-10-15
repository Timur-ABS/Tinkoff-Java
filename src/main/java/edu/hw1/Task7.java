package edu.hw1;

public final class Task7 {
    private Task7() {
    }

    private static final int BITS = 32;

    public static int rotateLeft(int n, int s) {
        int shift = s % BITS;
        return (n << shift) | (n >>> (BITS - shift));
    }

    public static int rotateRight(int n, int s) {
        int shift = s % BITS;
        return (n >>> shift) | (n << (BITS - shift));
    }
}
