package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task6Test {

    @Test
    public void testCountK() {
        assertEquals(5,Task6.countK(6621));
        assertEquals(4,Task6.countK(6554));
        assertEquals(3,Task6.countK(1234));
        assertEquals(0,Task6.countK(6174));
    }
}

