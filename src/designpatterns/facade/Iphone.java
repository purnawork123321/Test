package designpatterns.facade;

public class Iphone implements MobileShop {
    @Override
    public void modelName() {
        System.out.println(" Iphone 6 ");
    }
    @Override
    public void price() {
        System.out.println(" Rs 65000.00 ");
    }
}
