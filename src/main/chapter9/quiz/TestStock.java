package main.chapter9.quiz;

public class TestStock {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");
        oracle.setPreviousClosingPrice(34.5);
        oracle.setCurrentPrice(34.35);
        System.out.println(oracle.getChangePercent());
    }
}
