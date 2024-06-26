package DesignPatterns.ObserverDesignPattern;

public class WeatherDisplay implements  Observer{
private  String description;
    public  WeatherDisplay( String description){
        this.description=description;
    }
    @Override
    public void update(int temperature) {
        System.out.println("Weather Display    "+ description+"  :    Temperature is " +temperature+ " Degree Celsius ");
    }
}
