package main.chapter8;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        System.out.println(Arrays.toString(test(array)));
    }

    public static int[] test(int[][] m) {
        int[] result = new int[2];
        result[0] = m.length;
        result[1] = m[0].length;
        return result;
    }
}
