package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items=new ArrayList<>();

    void addItem(Item item){
        items.add(item);
    }

    void removeItem(Item item){
        items.remove(item);
    }

    void pay(PaymentType paymentStrategy){
       float sum=0;
        for (Item item : items){
            sum = item.getPrice()+sum;


       }
        paymentStrategy.pay(sum);
    }

}
