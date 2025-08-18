package main.chapter11.quiz;

public class Staff extends Employee {
    private String title;

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + super.getName() + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
