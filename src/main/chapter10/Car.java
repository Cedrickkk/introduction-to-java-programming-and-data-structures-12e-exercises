package main.chapter10;

public class Car {
    String make;
    String model;
    private Engine engineType;

    public Car(String make, String model, String engineType) {
        this.make = make;
        this.model = model;
        this.engineType = new Engine(engineType); // Tied to car lifecycle
        System.out.println(make + " " + model + " Card created with a " + engineType);
    }

    public void starCar() {
        System.out.println(make + " " + model + " is starting...");
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println(make + " " + model + " Car is being garbage collected.");
        super.finalize();
    }
}
