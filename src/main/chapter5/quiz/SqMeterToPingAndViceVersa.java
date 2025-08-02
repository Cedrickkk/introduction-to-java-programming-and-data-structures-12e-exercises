package main.chapter5.quiz;

public class SqMeterToPingAndViceVersa {
    public static void main(String[] args) {
        System.out.println("\nPing\t\t\tSquare meter\t|\tSquare meter\t\t\tPing");
        final double SQ_METERS_PER_PING = 3.305;
        for (int pingCtr = 10, sqMeterCtr = 30;
             pingCtr <= 80 && sqMeterCtr <= 100;
             pingCtr += 5, sqMeterCtr += 5) {
            double sqMeters = SQ_METERS_PER_PING * pingCtr;
            double pings = sqMeterCtr / SQ_METERS_PER_PING;
            System.out.printf("%d\t\t\t%16.3f\t|\t%d\t\t\t%16.3f", pingCtr, sqMeters, sqMeterCtr, pings);
            System.out.println();
        }
    }
}
