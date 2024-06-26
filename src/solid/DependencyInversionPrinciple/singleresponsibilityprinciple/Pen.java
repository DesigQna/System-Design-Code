package solid.DependencyInversionPrinciple.singleresponsibilityprinciple;

public class Pen {

    String name;
    String colour;
    int mfgYear;
    // expire data

    // 1st reason to change this class


    double price;

    //constructor
    public  Pen(String name,String colour,int mfgYear,double price ){
        // code
    }
    //getters and setters


    public double calculateTotal(int quantity ){

        // calculate
        return this.price*quantity;
        // 2nd reason to change
    }

    public void  printInvoice(){
        // print the invoice
        // 3rd reason to change
        // calculateTotal
        System.out.println("printing invoice ");
    }

    public  void saveDb(){
        // save data to database
        //change to code from saving db to file
        // 4th reason to change
    }
}
