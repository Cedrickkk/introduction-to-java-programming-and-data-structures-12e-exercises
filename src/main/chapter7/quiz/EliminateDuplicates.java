package main.chapter7.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        int[] listWithNoDuplicates = eliminateDuplicates(list);
        System.out.println(Arrays.toString(listWithNoDuplicates));
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int uniqueCounter = 0;

        Arrays.sort(list);
        
        temp[uniqueCounter] = list[0];
        uniqueCounter++;

        for (int i = 1; i < list.length; i++) {
            if (list[i] != temp[uniqueCounter - 1]) {
                temp[uniqueCounter] = list[i];
                uniqueCounter++;
            }
        }

        System.out.println(Arrays.toString(temp));

        int[] outList = new int[uniqueCounter];

        System.arraycopy(temp, 0, outList, 0, uniqueCounter);

        return outList;
    }
}
