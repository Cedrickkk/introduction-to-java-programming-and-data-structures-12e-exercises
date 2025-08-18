package main.chapter11.quiz;

public class TestInheritance {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Staff staff = new Staff();

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(staff);
    }
}
