package designpatterns.decorator;

public class SportsCarDecorator implements Car{

    Car car;
    SportsCarDecorator(Car car){
        this.car=car;
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding sports car features...");
    }
}
