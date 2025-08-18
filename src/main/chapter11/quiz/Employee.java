package main.chapter11.quiz;

import main.chapter10.quiz.MyDate;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", office='" + office + '\'' +
                ", salary=" + salary +
                ", dateHired=" + dateHired +
                '}';
    }
}
