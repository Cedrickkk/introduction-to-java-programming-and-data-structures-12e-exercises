package main.chapter11.quiz;

public class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                "}";
    }
}
