package solid.DependencyInversionPrinciple.LiskovSubstitutionPrinciple;



public class LiskovSubstitutionPrinciple {

    public static  void  testDrive( Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }
    public static void main(String[] args) {

      testDrive(new Vehicle());
        testDrive(new Bike());
        testDrive(new Car());
    }
}
