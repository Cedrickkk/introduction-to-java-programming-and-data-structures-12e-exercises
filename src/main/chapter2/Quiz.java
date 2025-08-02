package main.chapter2;

/**
 * TODO: Continue the Quiz Task in this chapter
 */

/**
 * This class {@code Quiz} contains solutions to various programming challenges
 * from Chapter 2 of Introduction to Java Programming and Data Structures 12th Edition textbook by Daniel Liang .
 */

public class Quiz {
    public static void main(String[] args) {
        physicsMotion(3.5, 4, 6.5);
    }

    /**
     * Quiz {@code 2.1} (Convert mile t o kilometer)
     * <p>
     * Write a program that reads a mile in a double value
     * from the console, converts it to kilometers, and displays the result.
     */
    private static void milesToKilometers(double miles) {
        final double KILOMETERS_PER_MILE = 1.6;
        System.out.println(miles * KILOMETERS_PER_MILE);
        double kilometers = ((int) ((miles * KILOMETERS_PER_MILE) * 10)) / 10.0;
        System.out.println(miles + " miles is " + kilometers + " kilometers");
    }

    /**
     * Quiz {@code 2.2} (Compute the volume of a triangle)
     * <p>
     * Write a program that reads in the length of
     * sides of an equilateral triangle and computes the area and volume
     */
    private static void volumeOfATriangle(double length) {
        double area = ((Math.sqrt(3) / 4.0) * Math.pow(length, 2));
        double volume = area * length;
        System.out.println("The area is : " + area);
        System.out.println("The volume of the Triangle prism is " + volume);
    }

    /**
     * Quiz {@code 2.3} (Convert meters into feet)
     * <p>
     * Write a program that reads a number in meters, converts
     * it to feet, and displays the result. One meter is {@code 3.2786} feet.
     */
    private static void metersToFeet(double meter) {
        final double METER_PER_FEET = 3.2786;
        double feet = meter * METER_PER_FEET;
        System.out.println(meter + " meters is " + feet + " feet");
    }

    /**
     * Quiz {@code 2.4} (Convert square meter into ping)
     * <p>
     * Write a program that converts square meter into
     * ping. The program prompts the user to enter a number in square meter, converts
     * it to ping, and displays the result. One square meter is {@code 0.3025} ping
     */
    private static void squareMeterToPing(double squareMeter) {
        final double PING_PER_SQ_METER = 0.3025;
        double ping = squareMeter * PING_PER_SQ_METER;
        System.out.println(squareMeter + " square meters is " + ping + " pings");
    }

    /**
     * Quiz {@code 2.5} (Financial application: calculate tips)
     * <p>
     * Write a program that reads the subtotal
     * and the gratuity rate and then computes the gratuity and total. For example, if the
     * user enters {@code 10} for subtotal and {@code 12%} for gratuity rate, the program displays {@code $1.2}
     * as gratuity and {@code $11.2} as total
     */
    private static void calculateTips(double gratuityRate, double subtotal) {
        double gratuity = (subtotal * (gratuityRate * 10)) / 100;
        double total = gratuity + subtotal;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }

    /**
     * Quiz {@code 2.6}  (Sum the digits in an integer)
     * <p>
     * Write a program that reads an integer between {@code 0}
     * and {@code 1000} and adds all the digits in the integer. For example, if an integer is {@code 932},
     * the sum of all its digits is {@code 14}.
     */
    private static void sumOfIntegers(int num) {
        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hundreds = num / 100;
        int sum = ones + tens + hundreds;
        System.out.println("The sum of the digits is " + sum);
    }

    /**
     * Quiz {@code 2.7} (Find the number of years)
     * <p>
     * Write a program that prompts the user to enter the minutes (e.g., {@code 1 billion}),
     * and displays the maximum number of years and remaining days for the minutes.
     * For simplicity assume that a year has {@code 365} days
     */
    private static void numberOfYearsAndDays(int minutes) {
        final int MINUTES_IN_AN_HOUR = 60;
        final int HOURS_IN_A_DAY = 24;
        final int DAYS_IN_A_YEAR = 365;
        final int MINUTES_PER_DAY = MINUTES_IN_AN_HOUR * HOURS_IN_A_DAY;

        int totalDays = minutes / MINUTES_PER_DAY;
        int years = totalDays / DAYS_IN_A_YEAR;
        int days = totalDays % DAYS_IN_A_YEAR;
        System.out.println(minutes + " minutes is approximately " + years + " and " + days + " days");
    }

    /**
     * Quiz {@code 2.8} (Current Time)
     * <p>
     * Revise the Listing 2.7 so it prompts the user to enter the time zome offset
     * to GMT and displays the time in the specified time zone.
     */
    private static void currentTime(int offset) {
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24 + offset + 24) % 24;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    /**
     * Quiz {@code 2.9} (Physics motion)
     * <p>
     * Wire a program that prompts the user to enter the initial velocity <i>u</i> in meters/second,
     * time span <i>t</i> in seconds and acceleration <i>a</i> in meters/second<sup>2</sup>, and returns
     * the distance covered.
     */
    private static void physicsMotion(double u, double t, double a) {
        double s = (u * t) + ((a * Math.pow(t, 2)) / 2.0);
        System.out.println(s);
    }
}
