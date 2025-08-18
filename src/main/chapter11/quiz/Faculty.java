package main.chapter11.quiz;

public class Faculty extends Employee {
    private String rank;
    private int officeHours;

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + super.getName() + '\'' +
                ", rank='" + rank + '\'' +
                ", officeHours=" + officeHours +
                '}';
    }
}
