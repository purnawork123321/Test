package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        MotorCycle motorCycle=new MotorCycle();
        Command command= new MotorCycleStartCommand(motorCycle);
        GhostRider rider = new GhostRider(command);
        rider.startRide();
        rider.stopRide();
        List<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        StartAllVehicles startAllVehicles=new StartAllVehicles(vehicles);
        startAllVehicles.start();
        startAllVehicles.stop();


    }
}
