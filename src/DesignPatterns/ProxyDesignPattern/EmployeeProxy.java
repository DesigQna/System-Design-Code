package DesignPatterns.ProxyDesignPattern;

public class EmployeeProxy implements  EmployeeDao{

    private  EmployeeDaoImpl employeeDaoImple;

    // constructor

    public  EmployeeProxy(){

        this.employeeDaoImple=new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, Employee obj) throws Exception {

        if(client.equalsIgnoreCase("ADMIN")){
            employeeDaoImple.create(client,obj);
            return;
        }throw new Exception("Access Denied ");
    }

    @Override
    public void delete(String client, String employeeId) throws Exception {


        if(client.equalsIgnoreCase("ADMIN")){
            employeeDaoImple.delete(client,employeeId);
            return;
        }throw new Exception("Access Denied ");
    }

    @Override
    public Employee get(String client, String employeeId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN")||client.equalsIgnoreCase("USER")){
          return   employeeDaoImple.get(client,employeeId);
        }
        throw new Exception("Access Denied ");
    }
}
