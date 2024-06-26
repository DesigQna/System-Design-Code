package DesignPatterns.FactoryPatternEx2;

public class NonVegFood implements Food {
    @Override
    public double price() {
        System.out.println("Getting NonVeg food for you ");
        return 1000.0;
    }
}
