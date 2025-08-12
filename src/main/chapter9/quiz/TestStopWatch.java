package main.chapter9.quiz;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100_000];

        System.out.println("Generating " + numbers.length + " random numbers.");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100_000);
        }
        System.out.println("Numbers generated.");

        StopWatch stopWatch = new StopWatch();

        System.out.println("Starting stopwatch and performing Selection Sort.");
        stopWatch.start();

        selectionSort(numbers);

        stopWatch.stop();
        System.out.println("Selection Sort completed.");

        System.out.println("Elapsed time for Selection Sort: " + stopWatch.getElapsedTime());
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
