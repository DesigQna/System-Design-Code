package DesignPatterns.AdapterDesignPattern;

public class Adapter implements  AppleCharger{

    private  AndroidCharger androidCharger;

    // constructor


    public Adapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void Charge() {

        androidCharger.charge();

        System.out.println(" Charging your phone with Adapter");

    }
}
