package designpatterns.command;

public class Car implements Vehicle{

        @Override
        public void start() {
            System.out.println("Start Car");
        }

        @Override
        public void stop() {
            System.out.println("stop Car");
        }

        @Override
        public void accelerate() {
            System.out.println("accelerate Car");
        }

}
