package DesignPatterns.BridgeDesignPattern;

public class LandBreatheImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathes through the Nose " +
                "Inhales oxygen from the Air  " +
                "Exhales carbon dioxide");
    }
}
