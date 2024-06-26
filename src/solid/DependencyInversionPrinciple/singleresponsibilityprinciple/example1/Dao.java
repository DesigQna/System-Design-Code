package solid.DependencyInversionPrinciple.singleresponsibilityprinciple.example1;

public class Dao {

    private  Pen pen;

    public Dao(Pen pen) {
        this.pen = pen;
    }

    public  void saveDb(){

        // some code for saving data into the db

    }
// save data into some other place == local text file

    public  void  saveTolocal(){

        // some code for saving data into the local

    }
  // modifying the existing code
}

// Open for extension and close for modification



