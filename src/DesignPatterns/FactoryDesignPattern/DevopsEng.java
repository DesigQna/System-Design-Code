package DesignPatterns.FactoryDesignPattern;

public class DevopsEng implements  Employee{
    @Override
    public int getSalary() {
        System.out.println("Getting Salary for Devops eng.");
        return 60000;
    }
}
