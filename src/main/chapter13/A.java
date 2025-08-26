package main.chapter13;

public interface A {
    void a();
}

class B implements A {
    public void a() {
        System.out.println("Test");
    }
}
