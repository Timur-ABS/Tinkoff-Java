package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Test
    public void testIsNestable() {
        // Provided Test Cases
        assertTrue(Task3.isNestable(new int[] {1, 2, 3, 4}, new int[] {0, 6}));
        assertTrue(Task3.isNestable(new int[] {3, 1}, new int[] {4, 0}));
        assertFalse(Task3.isNestable(new int[] {9, 9, 8}, new int[] {8, 9}));
        assertFalse(Task3.isNestable(new int[] {1, 2, 3, 4}, new int[] {2, 3}));

        // Additional Test Cases
        // Edge Cases
        assertTrue(Task3.isNestable(new int[] {}, new int[] {0, 1}), "Empty array should be nestable in any non-empty array");
        assertFalse(Task3.isNestable(new int[] {0, 1}, new int[] {}), "Non-empty array cannot be nestable in an empty array");
        assertTrue(Task3.isNestable(new int[] {}, new int[] {}), "Two empty arrays are considered nestable");

        // Cases with negative numbers
        assertTrue(Task3.isNestable(new int[] {-3, -1}, new int[] {-4, 0}), "Negative numbers should be considered");
        assertFalse(Task3.isNestable(new int[] {-3, -4}, new int[] {-4, -3}), "Array is not nestable if mins and maxs are equal");

        // Cases with similar mins or maxs
        assertFalse(Task3.isNestable(new int[] {1, 2, 3}, new int[] {1, 4}), "Array is not nestable if mins are equal");
        assertFalse(Task3.isNestable(new int[] {1, 2, 3}, new int[] {0, 3}), "Array is not nestable if maxs are equal");

        // Miscellaneous Cases
        assertTrue(Task3.isNestable(new int[] {10, 20, 30}, new int[] {5, 35}), "Test with larger numbers");
        assertTrue(Task3.isNestable(new int[] {10}, new int[] {9, 11}), "Single element arrays are nestable if condition holds");
        assertTrue(Task3.isNestable(new int[] {2, 3, 4}, new int[] {1, 2, 3, 4, 5}), "Test with arrays having more than 2 elements");
    }
}
