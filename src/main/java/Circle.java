
import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Turtle turtle, Point location, Color color, int border, int radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.setColor(color);
        turtle.setPenWidth(border);
        turtle.goTo(location.x, location.y - radius);
        turtle.penDown();

        int steos = 100;
        double angle = 360.0 / steos;
        double length = 2 * Math.PI * radius / steos ;

        for (int i = 0; i < steos; i++){
            turtle.forward(length);
            turtle.turnRight(angle);
        }
        turtle.penUp();
    }
}
