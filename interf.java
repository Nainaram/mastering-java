import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    protected float area;

    // Abstract methods
    abstract void acceptInput();
    abstract void calcArea();

    // Concrete method
    public float getArea() {
        return area;
    }
}

// Subclass Square
class Square extends Shape {
    private float side;

    @Override
    void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the side of the square: ");
        side = scanner.nextFloat();
    }

    @Override
    void calcArea() {
        area = side * side;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private float length;
    private float breadth;

    @Override
    void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextFloat();
        // System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextFloat();
    }

    @Override
    void calcArea() {
        area = length * breadth;
    }
}

// Subclass Circle
class Circle extends Shape {
    private float radius;

    @Override
    void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextFloat();
    }

    @Override
    void calcArea() {
        area = (float) (Math.PI * radius * radius);
    }
}

// Main class
public class interf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        // System.out.print("Enter the shape type (Square, Rectangle, Circle): ");
        String shapeType = scanner.nextLine();

        switch (shapeType.toLowerCase()) {
            case "square":
                shape = new Square();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
            case "circle":
                shape = new Circle();
                break;
            default:
                System.out.println("Invalid shape type!");
                System.exit(0);
        }

        shape.acceptInput();
        shape.calcArea();
        System.out.println("Area of " + shapeType + ": " + shape.getArea());
    }
}
