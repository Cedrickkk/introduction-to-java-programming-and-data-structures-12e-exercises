package main.chapter5.quiz;

public class FutureTuition {
    public static void main(String[] args) {
        double currentTuition = 10_000;
        double totalCostForNextFourYears = 0.0d;
        double rate = 1.06d;

        for (int i = 1; i <= 10; i++) {
            currentTuition = currentTuition * rate;
            System.out.print("The tuition for the next " + i + " years would be ");
            System.out.printf("$%.2f", currentTuition);
            System.out.println();
        }

        int j = 0;
        while (j < 4) {
            currentTuition = currentTuition * rate;
            totalCostForNextFourYears = totalCostForNextFourYears + currentTuition;
            j++;
        }

        System.out.printf("The total tuition for the next 4 years after the 10th year would be $%.2f", totalCostForNextFourYears);
    }
}
