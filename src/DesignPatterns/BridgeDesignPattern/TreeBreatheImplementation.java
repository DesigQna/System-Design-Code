package DesignPatterns.BridgeDesignPattern;

public class TreeBreatheImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathes through LEAVES" +
                "Inhales carbon dioxide" +
                "Exhales oxygen through Photosynthesis");
    }
}
