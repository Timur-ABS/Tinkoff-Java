package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task7Test {

    @Test
    public void testRotateLeft() {
        assertEquals(1, Task7.rotateLeft(16, 1));
        assertEquals(6, Task7.rotateLeft(17, 2));
        assertEquals(15, Task7.rotateLeft(15, 4)); // 1111 -> 1111
        assertEquals(16, Task7.rotateLeft(16, 5)); // 10000 -> 10000
        assertEquals(1, Task7.rotateLeft(16, 16)); // 10000 -> 00001
    }

    @Test
    public void testRotateRight() {
        assertEquals(4, Task7.rotateRight(8, 1));
        assertEquals(16, Task7.rotateRight(16, 5)); // 10000 -> 10000
        assertEquals(15, Task7.rotateRight(15, 4)); // 1111 -> 1111
    }
}
