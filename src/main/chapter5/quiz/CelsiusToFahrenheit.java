package main.chapter5.quiz;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("\nCelsius\t\t\tFahrenheit");
        for (int celsiusCtr = 0; celsiusCtr <= 100; celsiusCtr += 2) {
            double fahrenheit = (celsiusCtr * (9.0 / 5.0)) + 32;
            System.out.printf("%d\t\t\t%14.2f", celsiusCtr, fahrenheit);
            System.out.println();
        }
    }
}
