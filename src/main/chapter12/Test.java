package main.chapter12;

import java.io.IOException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    public static void refactorUsingTryWithResources(String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.printf("amount is %f %e\r\n", 32.32, 32.32);
            writer.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
            writer.printf("%6b\r\n", (1 > 2));
            writer.printf("%6s\r\n", "Java");
        }
    }
}
