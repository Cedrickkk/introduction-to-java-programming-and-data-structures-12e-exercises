package main.chapter13.casestudy;

import java.util.Arrays;

public class TestRationalClass {
    public static void main(String[] args) {
        Rational rational = new Rational(2, 3);
        Rational _rational = new Rational(3, 4);

        System.out.println(rational + " + " + _rational + " = " + rational.add(_rational));
        System.out.println(rational + " - " + _rational + " = " + rational.subtract(_rational));
        System.out.println(rational + " * " + _rational + " = " + rational.multiply(_rational));
        System.out.println(rational + " / " + _rational + " = " + rational.divide(_rational));
        System.out.println(_rational + " doubleValue() is " + _rational.doubleValue());

    }

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int gcd = 1;
        int k = 2;

        while (k <= nums[0] && k <= nums[nums.length - 1]) {
            if (nums[0] % k == 0 && nums[nums.length - 1] % k == 0) {
                gcd = k;
            }
            k++;
        }

        return gcd;
    }
}
