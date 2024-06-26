package solid.DependencyInversionPrinciple.LiskovSubstitutionPrinciple;

public class Bike extends Vehicle{
    public  void start(){

        System.out.println("Start the bike");
    }
    public  void stop(){

        System.out.println("Stop the bike");
    }
}
