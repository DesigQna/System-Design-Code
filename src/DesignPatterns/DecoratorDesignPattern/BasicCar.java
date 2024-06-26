package DesignPatterns.DecoratorDesignPattern;

public class BasicCar implements  Car{
    @Override
    public double getPrice() {
        return 20000;
    }

    @Override
    public String getDescription() {
        return "Basic Car";
    }
}
