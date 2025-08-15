package main.chapter10;

public class CompositionDemo {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", "VTEC");

        System.out.println("\n--- Simulating Car being scrapped ---");
        car = null;
        System.gc();
    }
}
