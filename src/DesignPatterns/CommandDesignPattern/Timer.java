package DesignPatterns.CommandDesignPattern;

public class Timer implements Command{

    private  Light light ;

    public  Timer (Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        System.out.println( "Light is on for 30min");
    }

    @Override
    public void undo() {
        System.out.println("turning off light ");
    }
}
