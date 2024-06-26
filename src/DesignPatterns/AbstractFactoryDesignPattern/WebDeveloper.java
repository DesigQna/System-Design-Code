package DesignPatterns.AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting salary of Web Dev");
        return 50000;
    }

    @Override
    public String name() {

        System.out.println("WEB DEVELOPER");
        return "Web Developer";
    }
}
