package solid.DependencyInversionPrinciple.LiskovSubstitutionPrinciple;

public class Car extends Vehicle{
    public  void start(){

        System.out.println("Start the Car");
    }
    public  void stop(){

        System.out.println("Stop the Car");
    }
}
