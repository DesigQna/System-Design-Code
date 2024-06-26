package solid.DependencyInversionPrinciple.singleresponsibilityprinciple.example2;

public class SeniorEmployee implements CalaculateSalary{
    @Override
    public double calculate(Employee employee) {

        // some higher tax
        return 60000.00;
    }
}
