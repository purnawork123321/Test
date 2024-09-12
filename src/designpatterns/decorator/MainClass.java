package designpatterns.decorator;

public class MainClass {
    public static void main(String[] args) {
        Car car =new BasicCar();
        car.assemble();

        Car luxuryCarDecorator =new LuxuryCarDecorator(new BasicCar());
        luxuryCarDecorator.assemble();

        Car sportsluxuryCar =new SportsCarDecorator(new LuxuryCarDecorator(new BasicCar()));
        sportsluxuryCar.assemble();
    }
}
