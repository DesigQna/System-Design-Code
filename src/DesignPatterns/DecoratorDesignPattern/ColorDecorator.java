package DesignPatterns.DecoratorDesignPattern;

public class ColorDecorator extends  CarDecorator{

    private  final  String color;
    public ColorDecorator(Car decoratedCar , String color) {
        super(decoratedCar);
        this.color=color;
    }

    @Override
    public  double getPrice(){

        //additional cost for color

        return  super.getPrice()+1000.0;
    }

    @Override
    public  String getDescription(){

        return  super.getDescription()+ " With " +color + "  color ";
    }
}
