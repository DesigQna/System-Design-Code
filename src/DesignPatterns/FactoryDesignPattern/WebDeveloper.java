package DesignPatterns.FactoryDesignPattern;

public class WebDeveloper implements  Employee{

    @Override
    public  int getSalary(){

        System.out.println("Getting salary for Web developer");

        return  50000;
    }
}
