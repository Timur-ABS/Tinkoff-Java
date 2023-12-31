package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {
    @ParameterizedTest()
    @CsvSource({
        "6621, 5",
        "6554, 4",
        "1234, 3",
        "6174, 0"
    })
    public void testCountK(int number, int expectedResult) {
        assertEquals(expectedResult, Task6.countK(number));
    }
}
