package DesignPatterns.ProxyDesignPattern;

public interface EmployeeDao {

      void  create(String client , Employee  obj) throws Exception;
     void  delete(String client , String employeeId) throws Exception;
     Employee get(String client, String employeeId) throws Exception;
}
