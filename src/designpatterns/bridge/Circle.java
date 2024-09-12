package designpatterns.bridge;

public class Circle extends Shape {

    Circle(DrawAPI drawAPI){

        super(drawAPI);
    }
    @Override
    public void draw() {
        drawAPI.draw();
        System.out.println("draw circle");
    }
}
