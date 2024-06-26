package DesignPatterns.CommandDesignPattern;

public class Demo {
    public static void main(String[] args) {


        System.out.println( "Command Design Pattern By desiQnA");


        // Receiver
        Light light = new Light();

        // Commands

        Command turnOn = new TurnOnCommand(light);
        Command turnOff= new TurnOffCommand(light);
        Command timer = new Timer(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

//        remote.setCommand(turnOn);
//        remote.pressButton(); // Light is on
   //remote.pressUndoButton(); // light is off
//        remote.setCommand(turnOff);
//        remote.pressButton();
        // undo
      //  remote.pressUndoButton();

    // timer


        remote.setCommand(timer);
        remote.pressButton();
remote.pressUndoButton();

    }
}
