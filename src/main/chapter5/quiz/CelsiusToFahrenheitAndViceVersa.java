package main.chapter5.quiz;

public class CelsiusToFahrenheitAndViceVersa {
    public static void main(String[] args) {
        System.out.println("\nCelsius\t\t\tFahrenheit\t|\tFahrenheit\t\t\tCelsius");
        for (int celsiusCtr = 0, fahrenheitCtr = 20;
             celsiusCtr <= 100 && fahrenheitCtr <= 270;
             celsiusCtr += 2, fahrenheitCtr += 5) {
            double fahrenheit = (celsiusCtr * (9.0 / 5.0)) + 32;
            double celsius = (fahrenheitCtr - 32) * (5.0 / 9.0);
            System.out.printf("%d\t\t\t%14.2f\t|\t%d\t\t\t%15.3f", celsiusCtr, fahrenheit, fahrenheitCtr, celsius);
            System.out.println();
        }
    }
}
