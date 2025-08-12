package main.chapter9;

import java.util.Random;

public class TestRandomClass {
    public static void main(String[] args) {
        Random random = new Random(3);
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(1000) + " ");
        }

        System.out.println();

        Random random1 = new Random(3);
        for (int i = 0; i < 10; i++) {
            System.out.print(random1.nextInt(1000) + " ");
        }
    }
}
