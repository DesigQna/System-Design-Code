package DesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private int temperature;
    private List<Observer> observers;

    public  WeatherStation(){
        this.observers = new ArrayList<>();

    }
    @Override
    public void addObserver(Observer observer) {


        System.out.println("Added");
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Removed");
       observers.remove(observer);
    }

    @Override
    public void notification() {

        for (Observer observer:observers
             ) {
            observer.update(temperature);
        }

    }

    public  void  setTemperature(int temperature){

        this.temperature= temperature;
        notification();
    }
}
