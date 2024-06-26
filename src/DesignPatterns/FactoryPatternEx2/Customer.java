package DesignPatterns.FactoryPatternEx2;

public class Customer {
    public static void main(String[] args) {



    //    Food food = new NonVegFood();

      Food vegFood=  FactoryClass.orderFood("VEG");
        System.out.println("Price : " + vegFood.price());
        Food nonFood=  FactoryClass.orderFood("NONVEG");
        System.out.println("Price : " + nonFood.price());

    }
}
