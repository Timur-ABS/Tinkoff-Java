package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    @ParameterizedTest
    @CsvSource({
        "'01:00', 60",
        "'13:56', 836",
        "'99:59', 5999",
        "'99999:59', 5999999"
    })
    public void testValidMinutesToSeconds(String input, int expected) {
        assertEquals(expected, Task1.convertMinutesToSeconds(input));
    }

    @ParameterizedTest
    @CsvSource({
        "'10:60'",
        "'01:ab'",
        "'10-0:00'",
        "'100:0-0'",
        "''",
        "'10:'",
        "':10'",
        "'10'",
        "'10:10:10'"
    })
    public void testInvalidMinutesToSeconds(String input) {
        assertEquals(-1, Task1.convertMinutesToSeconds(input));
    }
}
