package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {

    @Test
    public void testCountDigits() {
        assertEquals(4, Task2.countDigits(4666));
        assertEquals(3, Task2.countDigits(544));
        assertEquals(1, Task2.countDigits(0));
        assertEquals(3, Task2.countDigits(-341));
        assertEquals(2, Task2.countDigits(10));
        assertEquals(1, Task2.countDigits(-0));
        assertEquals(2, Task2.countDigits(-10));
    }
}
