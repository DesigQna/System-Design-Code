package DesignPatterns.AbstractFactoryDesignPattern;

public class Manager implements  Employee{
    @Override
    public int salary() {
        System.out.println("Getting salary of Manager");
        return 90000;
    }

    @Override
    public String name() {

        System.out.println("Manger");
        return "Manager";
    }
}
