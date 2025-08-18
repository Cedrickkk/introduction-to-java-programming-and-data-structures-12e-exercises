package main.chapter11;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new _Person());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {

}

class Student extends _Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class _Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}
