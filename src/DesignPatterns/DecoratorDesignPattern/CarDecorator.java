package DesignPatterns.DecoratorDesignPattern;

public abstract class CarDecorator  implements  Car{

    protected  final  Car decoratedCar;

    public  CarDecorator( Car decoratedCar){
        this.decoratedCar=decoratedCar;
    }

    @Override
    public  double getPrice(){

       return this.decoratedCar.getPrice();
    }

    @Override
    public  String getDescription(){
        return  this.decoratedCar.getDescription();
    }
}
