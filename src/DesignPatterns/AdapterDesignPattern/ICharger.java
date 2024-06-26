package DesignPatterns.AdapterDesignPattern;

public class ICharger implements  AppleCharger{
    @Override
    public void Charge() {
        System.out.println("Charging ..... iphone");
    }
}
