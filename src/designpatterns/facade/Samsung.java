package designpatterns.facade;

public class Samsung implements MobileShop {
    @Override
    public void modelName() {
        System.out.println(" Samsung galaxy tab 3 ");
    }
    @Override
    public void price() {
        System.out.println(" Rs 45000.00 ");
    }
}
