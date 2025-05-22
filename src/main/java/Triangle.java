import java.awt.*;

public class Triangle extends Shape{
    private int side;

    public Triangle(Turtle turtle, Point location, Color color, int border, int side) {
        super(turtle, location, color, border);
        this.side = side;
    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.setColor(color);
        turtle.setPenWidth(border);
        turtle.goTo(location.x, location.y);
        turtle.setHeading(0);
        turtle.penDown();

        int size = 15;

        for (int i = 0; i < 3; i++) {
            turtle.forward(side);
            turtle.turnRight(120);
        }

    }
}
