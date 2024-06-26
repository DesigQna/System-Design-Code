package DesignPatterns.ObserverDesignPattern;

public class Demo {
    public static void main(String[] args) {
         // Create Observers
        WeatherDisplay weatherDisplay1 = new WeatherDisplay("I am observer 1");

        WeatherDisplay weatherDisplay2= new WeatherDisplay("I am Observer 2");

        // create Subject
        WeatherStation weatherStation= new WeatherStation();

        // add the observers to Subject

        weatherStation.addObserver(weatherDisplay1);
        weatherStation.addObserver(weatherDisplay2);

        // Notify to all the Observers

        weatherStation.setTemperature(39);
        // removing the Observer
        weatherStation.removeObserver(weatherDisplay1);
        weatherStation.setTemperature(35);


    }
}
