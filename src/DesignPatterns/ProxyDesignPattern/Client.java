package DesignPatterns.ProxyDesignPattern;

public class Client {
    public static void main(String[] args) {
        System.out.println( "Proxy Design Pattern with DesiQNA");
        try{


            EmployeeDao employeeProxy = new EmployeeProxy();

//            employeeProxy.create("ADMIN", new Employee(2, "Raju"));
//            employeeProxy.create("ADMIN", new Employee(3, "Arvind"));
//            employeeProxy.create("USER", new Employee(4, "Parth"));
//
            employeeProxy.get("ADMIN","2");



        }
        catch (Exception e){
            System.out.println("Message :  "+ e.getMessage());
        }
    }
}
