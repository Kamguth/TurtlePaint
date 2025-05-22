import java.awt.*;

public class Square extends Shape{
    private int size;

    public Square(Turtle turtle, Point location, Color color, int border, int size) {
        super(turtle, location, color, border);
        this.size = size;
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

        for (int i = 0; i < 4; i++) {
            turtle.forward(size);
            turtle.turnRight(90);
        }

    }
}