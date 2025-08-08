package main.chapter7;

import java.util.Arrays;

public class TestArrayClass {
    public static void main(String[] args) {
        // SORTING
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'a', 'A', '4', 'F', 'd', 'P'};
        Arrays.sort(chars, 1, 3); // Sort part of the array
        Arrays.parallelSort(chars, 1, 3);
        System.out.println(Arrays.toString(chars));


        // SEARCHING
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " +
                Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " +
                Arrays.binarySearch(list, 12));

        char[] chars1 = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " +
                Arrays.binarySearch(chars1, 'a'));
        System.out.println("4. Index is " +
                Arrays.binarySearch(chars, 't'));

        // EQUALITY
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(java.util.Arrays.equals(list1, list2)); // true
        System.out.println(java.util.Arrays.equals(list2, list3)); // false

        // FILLING
        int[] list4 = {2, 4, 7, 10};
        int[] list5 = {2, 4, 7, 7, 7, 10};
        Arrays.fill(list4, 5);
        System.out.println(Arrays.toString(list4));
        Arrays.fill(list5, 1, 5, 8);
        System.out.println(Arrays.toString(list5));
    }
}
