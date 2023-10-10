package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task5Test {

    @Test
    public void testIsPalindromeDescendant() {
        assertTrue(Task5.isPalindromeDescendant(11211230));
        assertTrue(Task5.isPalindromeDescendant(13001120));
        assertTrue(Task5.isPalindromeDescendant(23336014));
        assertTrue(Task5.isPalindromeDescendant(11));
        assertTrue(Task5.isPalindromeDescendant(2));
        assertFalse(Task5.isPalindromeDescendant(13));
        assertTrue(Task5.isPalindromeDescendant(111111));
        assertFalse(Task5.isPalindromeDescendant(15));
        assertFalse(Task5.isPalindromeDescendant(11133118));
        //If there is an odd number of digits, there is a conditional 0 on the left
        assertTrue(Task5.isPalindromeDescendant(413));

    }
}

