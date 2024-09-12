package designpatterns.facade;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    public ShopKeeper(){
        iphone= new Iphone();
        samsung=new Samsung();

    }
    public void iphoneSale(){
        iphone.modelName();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelName();
        samsung.price();
    }


}
