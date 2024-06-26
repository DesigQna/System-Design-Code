package DesignPatterns.StrategyDesignPattern.strategy;

import DesignPatterns.StrategyDesignPattern.strategy.PaymentStrategy;

public class UPIPaymentStrategy implements PaymentStrategy {


    private  String phoneNumber;
    private  String pinCode;

  public   UPIPaymentStrategy( String phoneNumber, String pinCode ){
      this.phoneNumber= phoneNumber;
      this.pinCode=pinCode;
  }

    @Override
    public void pay(double amount) {
        System.out.println( "Paid $ "+ amount + "with UPI phone number ending with ******"+ phoneNumber.substring(phoneNumber.length()-4));
    }
}
