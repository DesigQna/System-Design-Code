package DesignPatterns.DecoratorDesignPattern;

public class LeatherSeatsDecorator extends  CarDecorator{


    public LeatherSeatsDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public  double getPrice(){

        return  super .getPrice()+ 2000;
    }
    @Override
    public  String getDescription(){

        return  super.getDescription()+ "  With Leather seats";
    }

}
