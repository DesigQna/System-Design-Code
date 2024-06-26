package solid.DependencyInversionPrinciple.singleresponsibilityprinciple.example1;

public class Invoice {
    private  Pen pen ;
    private  int quntity;

    private  CalculateClass calculateClass;

    public Invoice(Pen pen, int quntity,CalculateClass calculateClass) {
        this.pen = pen;
        this.quntity = quntity;
        this.calculateClass=calculateClass;
    }

    public void printInvoice(){
        calculateClass.calculateTotal();
        // code for printing invoice
    }

}
