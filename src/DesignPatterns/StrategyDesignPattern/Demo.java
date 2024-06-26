package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.strategy.PayPalPaymentStrategy;
import DesignPatterns.StrategyDesignPattern.strategy.PaymentStrategy;
import DesignPatterns.StrategyDesignPattern.strategy.UPIPaymentStrategy;

public class Demo {

    public static void main(String[] args) {
         ShoppingCart cart = new ShoppingCart();

       // PaymentStrategy useCreditCard= new CreditCardPaymentStrategy("1234567899", "12/24","556");
//         cart.SstPaymentStrategy(useCreditCard);
//         cart.checkout(100);

        PaymentStrategy payPal= new PayPalPaymentStrategy("ex@gmail.com","4545AA@4544");

        cart.setPaymentStrategy(payPal);

        cart.checkout(300);

        PaymentStrategy upi= new UPIPaymentStrategy("88999676788", "445566");

        cart.setPaymentStrategy(upi);
        cart.checkout(10);



    }



}
