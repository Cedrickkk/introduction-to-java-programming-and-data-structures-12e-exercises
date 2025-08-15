package main.chapter10.casestudy;

public class Course {
    private final String courseName;
    private final String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents < students.length) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            System.out.println("This course reached the maximum number of students enrolled.");
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
