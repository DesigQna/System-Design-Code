package DesignPatterns.StrategyDesignPattern.strategy;

public class CreditCardPaymentStrategy implements  PaymentStrategy{
    private  String cardNumber;
    private  String expireDate;
    private  String cvv;

    public  CreditCardPaymentStrategy(String cardNumber, String expireDate, String cvv){
        this.cardNumber = cardNumber;
        this.expireDate= expireDate;
        this.cvv=cvv;
    }
    @Override
    public void pay(double amount) {

        System.out.println( "Paid $" + amount + "   card number ending with "+ cardNumber.substring(cardNumber.length()-4));

    }
}
