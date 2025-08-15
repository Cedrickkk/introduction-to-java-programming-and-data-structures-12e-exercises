package main.chapter10;

public class AggregationDemo {
    public static void main(String[] args) {
        Professor dean = new Professor("Maningas", "OP");
        Professor alvarez = new Professor("Alvarez", "Mathematics");
        Professor althea = new Professor("Althea", "Science");
        Professor becca = new Professor("Becca", "Physics");
        Professor[] ccsFaculty = {alvarez, alvarez, becca};
        University plp = new University("Pamantasan ng Lungsod ng Pasig", dean, ccsFaculty);
        plp.displayUniversityInfo();

        System.out.println("\n--- Simulating University closure ---");
        plp = null;
        System.gc();

        System.out.println("\n--- Checking if professors still exists. ---");
        alvarez.teach();
        althea.teach();
        becca.teach();
    }
}
