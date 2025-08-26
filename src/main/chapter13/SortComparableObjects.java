package main.chapter13;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);

        for (String city : cities) {
            System.out.print(city + " ");
        }

        System.out.println();

        BigInteger[] numbers = {
                new BigInteger("2323231092923992"),
                new BigInteger("432232323239292"),
                new BigInteger("54623239292")
        };

        Arrays.sort(numbers);

        for (BigInteger number : numbers) {
            System.out.print(number + " ");
        }

    }
}
