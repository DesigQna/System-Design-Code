package DesignPatterns.ProxyDesignPattern;

public class EmployeeDaoImpl implements  EmployeeDao{
    @Override
    public void create(String client, Employee obj) {
        System.out.println(" Emp ID  : "+ obj.getEmpId() + "  and Name  :  "  +obj.getEmpName() +"  Employee Data has been saved successfully into the Database.....");
    }

    @Override
    public void delete(String client, String employeeId) {
        System.out.println( "Employee data has been deleted successfully from the Database");
    }

    @Override
    public Employee get(String client, String employeeId) {


        System.out.println( "Successfully fetched the employee data  with client : " + client);
        return  new Employee(
                1 , "emp1"
        );
    }
}
