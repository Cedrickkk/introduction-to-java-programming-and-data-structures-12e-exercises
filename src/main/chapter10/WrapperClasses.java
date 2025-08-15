package main.chapter10;

import java.math.BigInteger;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer x1 = new Integer("32");
        Integer x2 = new Integer("32");
        Integer x3 = Integer.valueOf("32");
        Integer x4 = Integer.valueOf("32");
        Integer x5 = 32;
        System.out.println("x1 == x2 is" + (x1 == x2)); // Display false
        System.out.println("x1 == x3 is" + (x1 == x3)); // Display false
        System.out.println("x3 == x4 is" + (x3 == x4)); // Display true
        System.out.println("x3 == x5 is" + (x3 == x5)); // Display true

        Integer _x1 = Integer.valueOf("128");
        Integer _x2 = Integer.valueOf("128");
        System.out.println("_x1 == _x2 is " + (_x1 == _x2)); // Display false

        System.out.println("The maximum integer is " + Integer.MAX_VALUE);
        System.out.println("The minimum positive float is " + Float.MIN_VALUE);
        System.out.println("The maximum double-precision floating-point number is " + Double.MAX_VALUE);

        System.out.println(Double.valueOf("32.25").intValue());
        System.out.println(Integer.valueOf("32").doubleValue());

        System.out.println(Double.valueOf(12.4).compareTo(Double.valueOf(12.3))); // returns 1
        System.out.println(Double.valueOf(12.3).compareTo(Double.valueOf(12.3))); // returns 0
        System.out.println(Double.valueOf(12.3).compareTo(Double.valueOf(12.51))); // returns -1

        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println(Integer.parseInt("11", 16));

        Integer x = 3 + Integer.valueOf(5);
        int y = Integer.valueOf(3);

        BigInteger bigIntA = new BigInteger("9223372036854775807");
        BigInteger bigIntB = new BigInteger("2");
        BigInteger bigIntC = bigIntA.multiply(bigIntB);
        System.out.println(bigIntC);

        BigInteger _x = new BigInteger("3");
        BigInteger _y = new BigInteger("7");
        BigInteger _z = _x.add(_y);
        System.out.println("x is " + _x);
        System.out.println("y is " + _y);
        System.out.println("z is " + _z);
    }
}
