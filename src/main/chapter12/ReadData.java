package main.chapter12;

import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("src/main/chapter12/scores.txt"));
        while (input.hasNext()) {
            String firstName = input.next();
            String middleInitial = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + middleInitial + " " + lastName + " " + score);
        }

        input.close();
    }
}
