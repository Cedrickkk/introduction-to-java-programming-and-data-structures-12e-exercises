package main.chapter10.casestudy;

public class TestCourse {
    public static void main(String[] args) {
        Course DSA = new Course("Data Structures and Algorithms");
        Course PE = new Course("Physical Education");

        DSA.addStudent("Cedric");
        DSA.addStudent("Kerwin");
        DSA.addStudent("Russel");

        PE.addStudent("Cedric");
        PE.addStudent("Kerwin");
        PE.addStudent("Russel");

        String[] DSAStudents = DSA.getStudents();
        System.out.println("The students enrolled " + DSA.getCourseName() + " course are: ");
        for (int i = 0; i < DSA.getNumberOfStudents(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(DSAStudents[i]);
        }

        String[] PEStudents = PE.getStudents();
        System.out.println("\nThe students enrolled " + PE.getCourseName() + " course are: ");
        for (int i = 0; i < PE.getNumberOfStudents(); i++) {
            if (i != PE.getNumberOfStudents() - 1) {
                System.out.print(PEStudents[i] + ", ");
            } else {
                System.out.print(PEStudents[i]);
            }
        }

    }
}
