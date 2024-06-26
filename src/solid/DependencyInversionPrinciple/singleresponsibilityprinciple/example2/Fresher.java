package solid.DependencyInversionPrinciple.singleresponsibilityprinciple.example2;

public class Fresher implements CalaculateSalary{
    @Override
    public double calculate(Employee employee) {
        // some tax
        return 25000.00;
    }
}
