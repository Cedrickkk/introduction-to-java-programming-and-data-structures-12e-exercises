package main.chapter11;

public class Fruit {

    public Fruit() {
        this("Mansanas");
        System.out.println("Overloaded constructor of the Fruit class is invoked.");
    }

    public Fruit(String name) {
        System.out.println("Fruit's constructor is invoked. Fruit name is: " + name);
    }
}
