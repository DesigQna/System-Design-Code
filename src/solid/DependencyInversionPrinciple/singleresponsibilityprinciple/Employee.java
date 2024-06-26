package solid.DependencyInversionPrinciple.singleresponsibilityprinciple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee {
    private  int id;
    private String name;
    private double salary;
    private Connection connection;


    // constructor



    // getters and setters


    // calculate salary
    public  double calculateSalary(){
        // code
        return salary;
    }



    public  void save() throws SQLException {
        this.connection= DriverManager.getConnection("URL","USERNAME","Passwprd");
        // code to save data
    }


}
