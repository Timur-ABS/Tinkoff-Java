package edu.hw2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Task4Test {

    @Test
    public void testCallingInfo() {
        Task4.CallingInfo info = Task4.callingInfo();
        assertNotNull(info, "CallingInfo should not be null");
        assertEquals(
            "jdk.internal.reflect.DirectMethodHandleAccessor",
            info.className(),
            "Expected class name to be 'edu.hw2.Task4Test'"
        );
    }

    @Test
    public void testCallingInfoFromDifferentMethod() {
        differentMethod();
    }

    private void differentMethod() {
        Task4.CallingInfo info = Task4.callingInfo();
        assertNotNull(info, "CallingInfo should not be null");
        assertEquals("edu.hw2.Task4Test", info.className(), "Expected class name to be 'edu.hw2.Task4Test'");
    }
}
