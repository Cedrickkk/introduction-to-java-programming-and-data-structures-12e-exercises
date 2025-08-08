package main.chapter7.casestudy;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = new int[10];
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(100);
        }

        selectionSort(list);

        System.out.println(Arrays.toString(list));
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Initialize the currentMin to be the ith element
            int currentMinimumElement = list[i];
            int currentMinimumIndex = i;

            // Look for the min element from the rest of the array
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < currentMinimumElement) {
                    currentMinimumElement = list[j];
                    currentMinimumIndex = j;
                }
            }

            // Prevent unnecessary swapping if currentElement at ith is in the correct position
            if (currentMinimumIndex != i) {
                list[currentMinimumIndex] = list[i];
                list[i] = currentMinimumElement;
            }
        }
    }
}
