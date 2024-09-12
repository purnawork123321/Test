package designpatterns.bridge;

public class Rectangle extends Shape {
    protected Rectangle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
