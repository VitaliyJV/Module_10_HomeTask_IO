package org.example;

public class For_Stack_Trace {

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement element : stackTrace) {
            System.out.printf(element.getMethodName(), element.getLineNumber(), element.getClassName(), element.getFileName());
        }
    }
}
