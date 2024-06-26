package DesignPatterns.AdapterDesignPattern;

public class Demo {
    public static void main(String[] args) {


        System.out.println("Adapter Design pattern");

       // AppleCharger charger = new ICharger();
//
//        Iphone12 iphone12 = new Iphone12(charger);
//
//        iphone12.ChargeIphone();


        AndroidCharger androidCharger = new AOneCharger();

       Adapter adapter = new Adapter(androidCharger);

        Iphone12 iphone12 = new Iphone12(adapter);

        iphone12.ChargeIphone();


    }
}
