package DesignPatterns.FactoryPatternEx2;

public class VegFood implements  Food{

    @Override
    public double price() {
        System.out.println("Getting Veg food for you ");
        return 500.0;
    }
}
