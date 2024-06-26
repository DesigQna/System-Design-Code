package DesignPatterns.FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {


        // create the objects

//        Employee employee = new DevopsEng();
//        int salary =  employee.getSalary();
//        System.out.println("Salary " + salary);

        Employee employee1=EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salary = employee1.getSalary();
        System.out.println("Salary of Web dev : "+ salary);
        Employee employee2= EmployeeFactory.getEmployee("DEVOPS ENG");
        System.out.println("salary : " +  employee2.getSalary());


    }
}
