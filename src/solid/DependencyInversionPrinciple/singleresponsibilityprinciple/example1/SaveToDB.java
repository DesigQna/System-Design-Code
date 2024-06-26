package solid.DependencyInversionPrinciple.singleresponsibilityprinciple.example1;

public class SaveToDB implements  testDao{
    @Override
    public void save(Pen pen) {
        // saving data to DB
    }
}
