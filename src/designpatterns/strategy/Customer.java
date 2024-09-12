package designpatterns.strategy;

public class Customer {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        Item item1=new Item();
        item1.setItemCode(1);
        item1.setPrice(40);

        shoppingCart.addItem(item1);

        Item item2=new Item();
        item2.setItemCode(11);
        item2.setPrice(402);

        shoppingCart.addItem(item2);

        shoppingCart.pay(new CreditCardStrategy("purna","123456","123","1209"));
        shoppingCart.pay(new PaypalStrategy("chandra","123456"));


    }
}
