package edu.hw2;

import org.jetbrains.annotations.Nullable;

public class Task4 {

    public static @Nullable CallingInfo callingInfo() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();

        if (stackTraceElements.length > 2) {
            StackTraceElement caller = stackTraceElements[2];
            return new CallingInfo(caller.getClassName(), caller.getMethodName());
        }

        return null;
    }

    public static void main(String[] args) {
        testMethod();
    }

    public static void testMethod() {
        CallingInfo info = callingInfo();
        System.out.println(info);
    }

    public record CallingInfo(String className, String methodName) {
    }
}
