package designpatterns.command;



public class CarStartCommand implements Command{

    Car car;
    CarStartCommand(Car car){
        this.car=car;
    }
    @Override
    public void execute() {
        car.start();
    }

    @Override
    public void revert() {
        car.stop();
    }
}

