package DesignPatterns.BridgeDesignPattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Bridge Design Pattern");

//        LivingThings dog = new Dog();
//        dog.breatheProcess();


        LivingThings fish = new Fish(new WaterBreatheImplementation());
        fish.breatheProcess();
        LivingThings frogInwater = new Frog(new WaterBreatheImplementation());
        frogInwater.breatheProcess();
        LivingThings frogonLand = new Frog(new LandBreatheImplementation());

        frogonLand.breatheProcess();
    }
}
