package DesignPatterns.AdapterDesignPattern;

public class Iphone12 {

    private  AppleCharger appleCharger;

    public  Iphone12 (AppleCharger appleCharger){

        this.appleCharger=appleCharger;
    }

    public  void ChargeIphone(){

        appleCharger.Charge();
        System.out.println("Charging the Iphone");
    }
}
