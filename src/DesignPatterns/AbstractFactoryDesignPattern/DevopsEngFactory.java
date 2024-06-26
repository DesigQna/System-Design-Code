package DesignPatterns.AbstractFactoryDesignPattern;

public class DevopsEngFactory extends  EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return  new DevopsEng();
    }
}
