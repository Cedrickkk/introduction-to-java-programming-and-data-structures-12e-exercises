package main.chapter13.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageArrayList {
    public static void main(String[] args) {
        average(new ArrayList<>(Arrays.asList(10, 20, 30)));
    }

    public static void average(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        System.out.println("The average of the list is " + sum / list.size());
    }
}
