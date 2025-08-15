package main.chapter10.quiz;

public class WeatherStation {
    public static final double BARS_PER_PSI = 0.0689475729;
    public static final double PSI_PER_BAR = 1 / BARS_PER_PSI;

    private double temperature;
    private double pressure;

    public WeatherStation() {
        this.temperature = 0;
        this.pressure = 1;
    }

    public WeatherStation(double temperatureCelsius, double pressureBar) {
        this.temperature = temperatureCelsius;
        this.pressure = pressureBar;
    }

    public static WeatherStation fromImperial(double temperatureFahrenheit, double pressurePSI) {
        double celsius = (temperatureFahrenheit - 32) * 5 / 9;
        double bar = pressurePSI * BARS_PER_PSI;
        return new WeatherStation(celsius, bar);
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemperatureFahrenheit() {
        return temperature * 9 / 5 + 32;
    }

    public double getPressurePSI() {
        return pressure * PSI_PER_BAR;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setTemperatureFahrenheit(double temperatureFahrenheit) {
        this.temperature = (temperatureFahrenheit - 32) * 5 / 9;
    }

    public void setPressurePSI(double pressurePSI) {
        this.pressure = pressurePSI * BARS_PER_PSI;
    }
}
