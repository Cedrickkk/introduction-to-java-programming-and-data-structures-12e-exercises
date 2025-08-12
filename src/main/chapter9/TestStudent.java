package main.chapter9;

import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name? " + student.name);
        System.out.println("age? " + student.age);
        System.out.println("isScienceMajor? " + student.isScienceMajor);
        System.out.println("gender? " + student.gender);

        Student notImmutableStudent = new Student("Ced", 20, false, 'M');

        Date notImmutableStudentDateCreated = notImmutableStudent.getDateCreated();
        notImmutableStudentDateCreated.setTime(200000); // dateCreated field is changed!

        
    }
}
