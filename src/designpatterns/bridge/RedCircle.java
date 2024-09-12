package designpatterns.bridge;

public class RedCircle implements DrawAPI{
    @Override
    public void draw() {
        System.out.println("draw Red circle");
    }
}
