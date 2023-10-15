package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @ParameterizedTest
    @CsvSource({
        "4666, 4",
        "544, 3",
        "0, 1",
        "-341, 3",
        "10, 2",
        "-0, 1",
        "-10, 2"
    })
    public void testCountDigits(int input, int expected) {
        assertEquals(expected, Task2.countDigits(input));
    }
}
