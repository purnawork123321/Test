package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class StartAllVehicles implements Vehicle{

    List<Vehicle> Vehicles =new ArrayList<>();

    StartAllVehicles(List<Vehicle> Vehicles){
        this.Vehicles=Vehicles;
    }

    @Override
    public void start() {
        Vehicles.forEach(vehicle -> vehicle.start());
    }

    @Override
    public void stop() {
        Vehicles.forEach(vehicle -> vehicle.stop());
    }

    @Override
    public void accelerate() {

    }
}
