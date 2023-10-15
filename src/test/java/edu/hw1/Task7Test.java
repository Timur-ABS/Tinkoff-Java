package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7Test {
    @ParameterizedTest
    @CsvSource({
        "5, 1, 10",      // 5 (101 в двоичной системе) со сдвигом влево на 1 становится 10 (1010 в двоичной системе)
        "10, 2, 40",     // 10 (1010 в двоичной системе) со сдвигом влево на 2 становится 40 (101000 в двоичной системе)
        "15, 3, 120"
        // 15 (1111 в двоичной системе) со сдвигом влево на 3 становится 120 (1111000 в двоичной системе)
    })
    public void testRotateLeft(int input, int shift, int expected) {
        assertEquals(expected, Task7.rotateLeft(input, shift));
    }

    @ParameterizedTest
    @CsvSource({
        "10, 1, 5",      // 10 (1010 в двоичной системе) со сдвигом вправо на 1 становится 5 (101 в двоичной системе)
        "40, 2, 10",
        // 40 (101000 в двоичной системе) со сдвигом вправо на 2 становится 10 (1010 в двоичной системе)
        "120, 3, 15"
        // 120 (1111000 в двоичной системе) со сдвигом вправо на 3 становится 15 (1111 в двоичной системе)
    })
    public void testRotateRight(int input, int shift, int expected) {
        assertEquals(expected, Task7.rotateRight(input, shift));
    }
}
