package edu.hw1;

public final class Task7 {
    private Task7() {

    }

    private static final int bits = 32;

    public static int rotateLeft(int n, int shift) {
        shift = shift % bits;
        return (n << shift) | (n >>> (bits - shift));
    }

    public static int rotateRight(int n, int shift) {
        shift = shift % bits;
        return (n >>> shift) | (n << (bits - shift));
    }
}
