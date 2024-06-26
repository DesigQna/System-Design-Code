package DesignPatterns.FacadeDesignPattern;

public class Demo {

    public static void main(String[] args) {


        System.out.println( "Facade Design pattern ");

        Computer computer = new Computer();

             computer.start();
            computer.running();
              computer.stop();

    }
}
