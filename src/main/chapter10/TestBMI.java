package main.chapter10;

public class TestBMI {
    public static void main(String[] args) {
        BMI ced = new BMI("Cedric", 20, 176.37, 67.7165);
        System.out.println("The BMI for " + ced.getName() + " is " + ced.getBMI() + " " + ced.getStatus());

        BMI ericka = new BMI("Ericka", 21, 110.231, 52);
        System.out.println("The BMI for " + ericka.getName() + " is " + ericka.getBMI() + " " + ericka.getStatus());
    }
}
