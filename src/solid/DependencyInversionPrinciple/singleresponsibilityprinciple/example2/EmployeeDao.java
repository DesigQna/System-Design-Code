package solid.DependencyInversionPrinciple.singleresponsibilityprinciple.example2;

public class EmployeeDao {
    private  Connection connection ;

    // constructor

    public  void save(){
        connection.create();
        // save to db

    }
}
