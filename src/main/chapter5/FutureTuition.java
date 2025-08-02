package main.chapter5;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10_000d;
        int years = 0;

        while (tuition < 20_000) {
            tuition = tuition * 1.07;
            years++;
        }

        System.out.println("The tuition will be double in " + years + " years.");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, years);
    }
}
