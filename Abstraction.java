import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    float area;

    abstract void acceptInput();
    abstract void calcArea();

    public float getArea() {
        return area;
    }
}

// Class Square extending Shape
class Square extends Shape {
    float side;

    @Override
    void acceptInput() {
        Scanner scan = new Scanner(System.in);
        // Removed the prompt
        side = scan.nextFloat();
    }

    @Override
    void calcArea() {
        area = side * side;
    }
}

// Class Rectangle extending Shape
class Rectangle extends Shape {
    float length, breadth;

    @Override
    void acceptInput() {
        Scanner scan = new Scanner(System.in);
        // Removed the prompt
        length = scan.nextFloat();
        breadth = scan.nextFloat();
    }

    @Override
    void calcArea() {
        area = length * breadth;
    }
}

// Class Circle extending Shape
class Circle extends Shape {
    float radius;

    @Override
    void acceptInput() {
        Scanner scan = new Scanner(System.in);
        // Removed the prompt
        radius = scan.nextFloat();
    }

    @Override
    void calcArea() {
        area = (float) (Math.PI * radius * radius);
    }
}

// Main class
public class Abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();  // Removed the shape type prompt
        Shape sp = null;

        // Shape selection logic
        if (input.equalsIgnoreCase("Square")) {
            sp = new Square();
        } else if (input.equalsIgnoreCase("Rectangle")) {
            sp = new Rectangle();
        } else if (input.equalsIgnoreCase("Circle")) {
            sp = new Circle();
        } else {
            System.exit(0);
        }

        // Accept input and calculate area
        sp.acceptInput();
        sp.calcArea();
        System.out.println(sp.getArea());  // Only output the area
    }
}
