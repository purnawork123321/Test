package designpatterns.command;

public class GhostRider {

    Command command;

    GhostRider(Command command){
        this.command=command;
    }

    void startRide(){
        command.execute();
    }

    void stopRide(){
        command.revert();
    }
}
