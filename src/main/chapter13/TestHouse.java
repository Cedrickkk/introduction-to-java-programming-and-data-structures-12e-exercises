package main.chapter13;

public class TestHouse {
    public static void main(String[] args) {
        House house = new House(1, 1750.50);
        House house1 = (House) house.clone();

        System.out.println(house.equals(house1));
        System.out.println(house == house1);
        System.out.println(house1);
        System.out.println(house.getWhenBuilt() == house1.getWhenBuilt());
    }
}



