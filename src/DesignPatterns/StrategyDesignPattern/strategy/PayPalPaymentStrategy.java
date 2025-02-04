package DesignPatterns.StrategyDesignPattern.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy{

    private  String email;
    private String password;

    public PayPalPaymentStrategy(String email, String password){
        this.email= email;
        this.password= password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + "with PayPal account "+ email);
    }
}
