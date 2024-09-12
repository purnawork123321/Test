package designpatterns.bridge;

public class MainClass {
    public static void main(String[] args) {
        Shape shape = new Circle(new GreenCircle());
        shape.draw();

    }
}
