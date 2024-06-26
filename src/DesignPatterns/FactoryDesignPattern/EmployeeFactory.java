package DesignPatterns.FactoryDesignPattern;

public class EmployeeFactory {

public static  Employee getEmployee(String empType){

    if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){

        return  new WebDeveloper();
    }else if (empType.trim().equalsIgnoreCase("DEVOPS ENG")){

        return  new DevopsEng();
    }else {
        return  null;
    }
}

}
