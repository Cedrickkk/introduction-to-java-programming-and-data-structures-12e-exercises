package main.chapter9;

import java.util.Date;

public class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
    Date dateCreated;

    public Student() {
    }

    public Student(String name, int age, boolean isScienceMajor, char gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
        this.dateCreated = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
