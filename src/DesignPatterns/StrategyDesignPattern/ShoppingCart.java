package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.strategy.PaymentStrategy;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;


    // set the Payment method

    public  void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy= paymentStrategy;
    }
    // checkout

    public  void  checkout(double totalAmount){

        paymentStrategy.pay(totalAmount);
    }

}
