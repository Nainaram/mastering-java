// Define an interface
interface Shape {
    double calculateArea();
}

// Create a base class with abstraction
abstract class AbstractShape implements Shape {
    // Common method for all shapes
    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Create a class for Rectangle that extends AbstractShape
class Rectangles extends AbstractShape {
    private double length;
    private double width;

    public Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("This is a rectangle.");
    }
}

// Create a class for Circle that extends AbstractShape
class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("This is a circle.");
    }
}

// Create a class for Square that extends Rectangle
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("This is a square.");
    }
}

public class Shapes {
    public static void main(String[] args) {
        // Using polymorphism and abstraction
        Shape rectangle = new Rectangle(50, 10);
        // this 
        Shape circle = new Circle(7);

        // Use Square type for square variable
        Square square = new Square(4);

        // Display information and calculate area
        displayShapeInfo(rectangle);
        displayShapeInfo(circle);
        displayShapeInfo(square); // Now this line should work without any issue
    }

    private static void displayShapeInfo(Square square) {
    }

    // Method to display information and calculate area
    // Method to display information and calculate area
    private static void displayShapeInfo(Shape shape) {
        shape.displayInfo();
        System.out.println("Area: " + shape.calculateArea());
        System.out.println();
    }
}

