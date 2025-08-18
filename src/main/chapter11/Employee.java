package main.chapter11;

public class Employee extends Person {
    public Employee() {
        this("(2) Invokes Employee's overloaded constructor.");
        System.out.println("(3) Perform Employee's tasks.");
    }

    public Employee(String str) {
        System.out.println(str);
    }
}
