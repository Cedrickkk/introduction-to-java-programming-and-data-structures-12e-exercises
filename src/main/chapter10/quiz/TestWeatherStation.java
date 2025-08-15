package main.chapter10.quiz;

public class TestWeatherStation {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        System.out.printf("\nTemp = %.2f°C (%.2f°F), Pressure = %.2f bar (%.2f PSI)%n",
                weatherStation.getTemperature(), weatherStation.getTemperatureFahrenheit(),
                weatherStation.getPressure(), weatherStation.getPressurePSI());
    }
}
