package edu.hw2;

import java.util.logging.Logger;
import org.jetbrains.annotations.Nullable;

public class Task4 {

    private static final Logger LOGGER = Logger.getLogger(Task4.class.getName());

    // Private constructor to prevent instantiation of utility class
    private Task4() {
        throw new UnsupportedOperationException("Utility class should not be instantiated");
    }

    public static @Nullable CallingInfo callingInfo() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();

        if (stackTraceElements.length > 2) {
            StackTraceElement caller = stackTraceElements[2];
            return new CallingInfo(caller.getClassName(), caller.getMethodName());
        }

        return null;
    }

    /**
     * Main method to test the callingInfo function.
     */
    public static void Task4Chek(String[] args) {
        testMethod();
    }

    public static void testMethod() {
        CallingInfo info = callingInfo();
        LOGGER.info(info.toString());
    }

    public record CallingInfo(String className, String methodName) {
    }
}
