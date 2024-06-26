package DesignPatterns.DecoratorDesignPattern;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Decorator Design Pattern ");
        // Basic model
        System.out.println("Basic model data ");
        Car basicCar= new BasicCar();

        System.out.println( "Description : " + basicCar.getDescription()+ "  And price : " + basicCar.getPrice() );


        // car with Red color
        System.out.println( " Basic model with color data ");
        Car carWithRedColor= new ColorDecorator(new BasicCar(), "RED");
        System.out.println( "Description : " + carWithRedColor.getDescription()+ "  And price : " + carWithRedColor.getPrice() );


        // Car with color and Leather seats
        System.out.println("carWithExtraFeatures");
        Car carWithExtraFeatures=new SunroofDecorator( new LeatherSeatsDecorator(new ColorDecorator(new BasicCar(), "Blue")));
        System.out.println( "Description : " + carWithExtraFeatures.getDescription()+ "  And price : " + carWithExtraFeatures.getPrice() );

    }
}
