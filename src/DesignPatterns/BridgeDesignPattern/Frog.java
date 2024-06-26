package DesignPatterns.BridgeDesignPattern;

public class Frog extends LivingThings{
    public Frog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
