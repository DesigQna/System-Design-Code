package DesignPatterns.DecoratorDesignPattern;

public class SunroofDecorator extends  CarDecorator{
    public SunroofDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public  double getPrice(){

        return  super.getPrice() + 1500;

    }
    public String getDescription(){

        return  super.getDescription()+ " With Sunroof ";
    }
}
