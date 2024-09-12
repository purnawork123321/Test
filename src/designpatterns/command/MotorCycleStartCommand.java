package designpatterns.command;

public class MotorCycleStartCommand implements Command{

    MotorCycle motorCycle;
    MotorCycleStartCommand(MotorCycle motorCycle){
        this.motorCycle=motorCycle;
    }
    @Override
    public void execute() {
        motorCycle.start();
    }

    @Override
    public void revert() {
motorCycle.stop();
    }
}
