import java.util.Scanner;
class Rectangle {
    // Create 2 private variables
    private double length;
    private double width;

    // Create a default constructor
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Create a parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Create getLength() function
    public double getLength() {
        return length;
    }

    // Create getWidth() function
    public double getWidth() {
        return width;
    }

    // Create getArea() function
    public double getArea() {
        return length * width;
    }
}
class W02_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        // System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        // System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Create Rectangle objects
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(length, width);

        // Print rectangle dimensions
        System.out.print("Default Rectangle: L, W, A : ");
        System.out.println(rect1.getLength() + ", " + rect1.getWidth() + ", " + rect1.getArea());
        System.out.print("Parameterised Rectangle: L, W, A : ");
        System.out.print(rect2.getLength() + ", " + rect2.getWidth() + ", " + rect2.getArea());

        scanner.close();
    }
}