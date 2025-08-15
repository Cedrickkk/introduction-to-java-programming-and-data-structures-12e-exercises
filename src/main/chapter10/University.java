package main.chapter10;

public class University {
    String name;
    private Professor dean;
    private Professor[] faculty;

    public University(String name, Professor dean, Professor[] faculty) {
        this.name = name;
        this.dean = dean;
        this.faculty = faculty;
        System.out.println(name + " University established.");
    }

    public void displayUniversityInfo() {
        System.out.println("\n--- " + name + " Information ---");
        System.out.println("Dean: " + dean.name);
        System.out.print("Faculty: ");
        for (Professor p : faculty) {
            System.out.print(p.name + " ");
        }
        System.out.println("\n--------------------------");
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println(name + " University is being garbage collected.");
        super.finalize();
    }
}
