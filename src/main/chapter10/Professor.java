package main.chapter10;

public class Professor {
    String name;
    String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
        System.out.println("Professor " + name + " created.");
    }

    public void teach() {
        System.out.println(name + " is teaching in " + department);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Professor " + name + " is being garbage collected.");
        super.finalize();
    }

    
}
