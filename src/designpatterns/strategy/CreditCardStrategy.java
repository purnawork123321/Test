package designpatterns.strategy;

public class CreditCardStrategy implements PaymentType{

    String name;
    String cardNumber;
    String cvv;
    String expiryDate;

    CreditCardStrategy(String name,String cardNumber,String cvv,String expiryDate){
        this.name=name;
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        this.expiryDate=expiryDate;
    }

    @Override
    public void pay(float sum) {
        System.out.println(sum +" Payment using creditcard "+this.name);
    }
}
