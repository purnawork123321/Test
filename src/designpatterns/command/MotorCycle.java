package designpatterns.command;

public class MotorCycle implements Vehicle{

    @Override
    public void start() {
        System.out.println("Start MotorCycle");
    }

    @Override
    public void stop() {
        System.out.println("stop MotorCycle");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate MotorCycle");
    }
}
