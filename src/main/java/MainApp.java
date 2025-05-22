import java.awt.*;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter canvas width: ");
        int width = scanner.nextInt();
        System.out.print("Enter canvas height: ");
        int height = scanner.nextInt();

        // Create a turtle and set world coordinates
        World world = new World(width, height);
        Turtle turtle = new Turtle(world, -width / 2, -height / 2);


        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add Shape");
            System.out.println("2. Save Image");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nSelect a shape to draw:");
                System.out.println("1. Circle");
                System.out.println("2. Square");
                System.out.println("3. Triangle");
                System.out.print("Enter shape number: ");
                int shapeChoice = scanner.nextInt();

                System.out.print("Enter border width: ");
                int border = scanner.nextInt();


                System.out.println("Enter RGB color values (0–255):");
                System.out.print("R: ");
                int r = scanner.nextInt();
                System.out.print("G: ");
                int g = scanner.nextInt();
                System.out.print("B: ");
                int b = scanner.nextInt();
                Color color = new Color(r, g, b);


                System.out.print("Enter X coordinate: ");
                int x = scanner.nextInt();
                System.out.print("Enter Y coordinate: ");
                int y = scanner.nextInt();
                Point location = new Point(x, y);

                Shape shape = null;

                switch (shapeChoice) {
                    case 1:
                        System.out.print("Enter radius: ");
                        int radius = scanner.nextInt();
                        shape = new Circle(turtle, location, color, border, radius);
                        break;
                    case 2:
                        System.out.print("Enter side length: ");
                        int side = scanner.nextInt();
                        shape = new Square(turtle, location, color, border, side);
                        break;
                    case 3:
                        System.out.print("Enter side length: ");
                        int length = scanner.nextInt();
                        shape = new Triangle(turtle, location, color, border, length);
                        break;
                    default:
                        System.out.println("Invalid shape selection.");
                        continue;
                }

                if (shape != null) {
                    shape.paint();
                    System.out.println("Shape drawn successfully.");
                }

            } else if (choice == 2) {
                System.out.println("Saving image");
                // Saving function not there yet
            } else if (choice == 0) {
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }

        scanner.close();
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
//        World world = new World(200, 200);
//        Turtle turtle = new Turtle(world,-100, -100);
//
//        int width = 200;
//        int height = 200;
//
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(4);
//        turtle.setColor(Color.RED);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);
    }
}