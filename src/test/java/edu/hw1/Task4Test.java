package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task4Test {

    @Test
    public void testFixString() {
        assertEquals("214365", Task4.fixString("123456"));
        assertEquals("This is a mixed up string.", Task4.fixString("hTsii  s aimex dpus rtni.g"));
        assertEquals("abcde", Task4.fixString("badce"));
        assertEquals("hTsii  s aimex dpus rtni.g", Task4.fixString("This is a mixed up string."));
        assertEquals("a", Task4.fixString("a"));
        assertEquals("", Task4.fixString(""));

    }
}

