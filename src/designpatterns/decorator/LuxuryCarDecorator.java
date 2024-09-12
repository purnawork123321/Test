package designpatterns.decorator;

public class LuxuryCarDecorator implements Car{

    Car car;

    LuxuryCarDecorator(Car car){
        this.car=car;
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding luxury car features..");
    }
}
