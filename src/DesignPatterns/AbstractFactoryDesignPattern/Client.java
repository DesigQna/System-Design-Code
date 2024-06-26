package DesignPatterns.AbstractFactoryDesignPattern;

public class Client {
    public static void main(String[] args) {

       Employee e1= EmployeeFactory.getEmployee(new DevopsEngFactory());

        e1.name();
        e1.salary();
        Employee e2= EmployeeFactory.getEmployee(new WebDevFactory());
        e2.name();
        e2.salary();

        Employee m1= EmployeeFactory.getEmployee(new ManegerFactory());
        m1.name();
        m1.salary();
    }
}
