package DesignPatterns.AdapterDesignPattern;

public class AOneCharger implements  AndroidCharger{
    @Override
    public void charge() {
        System.out.println("Charging ..... Android");
    }
}
