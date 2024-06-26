package DesignPatterns.AbstractFactoryDesignPattern;

public class DevopsEng implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting salary of  Devops Eng");
        return 70000;
    }

    @Override
    public String name() {

        System.out.println("DEVOPS ENG.");
        return "Devops eng";
    }
}
