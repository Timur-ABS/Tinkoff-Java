package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    public void testMinutesToSeconds() {
        // Positive test cases (valid inputs)
        assertEquals(60, Task1.minutesToSeconds("01:00"));
        assertEquals(836, Task1.minutesToSeconds("13:56"));
        assertEquals(5999, Task1.minutesToSeconds("99:59"));
        assertEquals(5999999, Task1.minutesToSeconds("99999:59"));
        // Negative test cases (invalid inputs)
        assertEquals(-1, Task1.minutesToSeconds("10:60"));
        assertEquals(-1, Task1.minutesToSeconds("01:ab"));

        assertEquals(-1, Task1.minutesToSeconds("10-0:00"));
        assertEquals(-1, Task1.minutesToSeconds("100:0-0"));
        assertEquals(-1, Task1.minutesToSeconds(""));
        assertEquals(-1, Task1.minutesToSeconds("10:"));
        assertEquals(-1, Task1.minutesToSeconds(":10"));
        assertEquals(-1, Task1.minutesToSeconds("10"));
        assertEquals(-1, Task1.minutesToSeconds("10:10:10"));
    }
}
