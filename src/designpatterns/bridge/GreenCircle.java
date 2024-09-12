package designpatterns.bridge;

public class GreenCircle implements DrawAPI{
    @Override
    public void draw() {
        System.out.println("draw green circle");
    }
}
