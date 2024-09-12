package designpatterns.strategy;

public class PaypalStrategy implements PaymentType{
    String userName;
    String password;

    PaypalStrategy(String userName,String password){
        this.password=password;
        this.userName=userName;
    }

    @Override
    public void pay(float sum) {
        System.out.println(sum +" Payment using Paypal "+ this.userName);
    }
}
