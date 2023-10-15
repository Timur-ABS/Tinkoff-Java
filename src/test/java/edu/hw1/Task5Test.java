package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {
    @ParameterizedTest
    @CsvSource({
        "11211230, true",
        "13001120, true",
        "23336014, true",
        "11, true",
        "2, true",
        "13, false",
        "111111, true",
        "15, false",
        "11133118, false"
    })
    public void testIsPalindromeDescendant(int number, boolean expectedResult) {
        assertEquals(expectedResult, Task5.isPalindromeDescendant(number));
    }
}
