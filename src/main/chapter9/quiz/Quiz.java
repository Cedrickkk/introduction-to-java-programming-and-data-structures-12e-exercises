package main.chapter9.quiz;

import java.util.Random;

public class Quiz {
    public Quiz() {
    }

    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 50; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(random.nextInt(100));
            } else {
                System.out.print(random.nextInt(100) + " ");
            }
        }
    }
}
