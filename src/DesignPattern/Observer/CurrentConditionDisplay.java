/*
    Observer instance implement Observer interface and DisplayElement interface
 */
package DesignPattern.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData w) {
        this.weatherData = w;
        w.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }

    public void removeSelf() {
        weatherData.removeObserver(this);
    }
}
