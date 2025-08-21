package main.chapter12;

import java.util.Arrays;

public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            StackTraceElement[] traceElements = ex.getStackTrace();
            System.out.println();
            Arrays.stream(ex.getStackTrace()).forEach(System.out::println);

            System.out.println("\nTrace Info Obtained from getStackTrace");
            for (StackTraceElement traceElement : traceElements) {
                System.out.print("method " + traceElement.getMethodName());
                System.out.print("(" + traceElement.getClassName() + ":");
                System.out.println(traceElement.getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++) {
            int j = list[i];
            result += j;
        }
        return result;
    }
}
