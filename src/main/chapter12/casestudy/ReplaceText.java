package main.chapter12.casestudy;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws IOException {
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldtStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);

        if (!sourceFile.exists()) {
            System.out.println("Target file " + args[0] + " doesn't exists.");
            System.exit(2);
        }

        File targetFile = new File(args[1]);

        if (targetFile.exists()) {
            System.out.println("Target file " + args[0] + " already exists.");
            System.exit(3);
        }

        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter writer = new PrintWriter(targetFile)
        ) {
            while (input.hasNext()) {
                String str1 = input.nextLine();
                String str2 = str1.replaceAll(args[2], args[3]);
                writer.println(str2);
            }
        }
    }
}
