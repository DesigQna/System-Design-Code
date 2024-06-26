package DesignPatterns.BridgeDesignPattern;

public class WaterBreatheImplementation implements  BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathes through the GILLS" +
                "Absorbs the oxygen from water " +
                "Exhales the carbon dioxide ");
    }
}
