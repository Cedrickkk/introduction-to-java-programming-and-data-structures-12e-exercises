package main.chapter5.quiz;

public class InchesToCentimeter {
    public static void main(String[] args) {
        System.out.println("\nInches\t\t\tCentimeters");
        for (int i = 1; i <= 10; i++) {
            final double CENTIMETERS_PER_INCH = 2.54;
            double centimeters = CENTIMETERS_PER_INCH * i;
            System.out.printf("%d\t\t\t%14.2f", i, centimeters);
            System.out.println();
        }
    }
}
