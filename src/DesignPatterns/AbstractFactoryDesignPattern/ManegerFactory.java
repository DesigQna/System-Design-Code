package DesignPatterns.AbstractFactoryDesignPattern;

public class ManegerFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
