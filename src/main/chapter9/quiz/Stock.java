package main.chapter9.quiz;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = 0;
        this.currentPrice = 0;
    }

    public double getChangePercent() {
        return ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
}
