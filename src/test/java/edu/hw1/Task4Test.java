package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    @ParameterizedTest()
    @CsvSource({
        "123456, 214365",
        "hTsii  s aimex dpus rtni.g, This is a mixed up string.",
        "badce, abcde",
        "This is a mixed up string., hTsii  s aimex dpus rtni.g",
        "a, a",
        ", "
    })
    public void testFixString(String input, String expectedResult) {
        assertEquals(expectedResult, Task4.fixString(input));
    }
}
