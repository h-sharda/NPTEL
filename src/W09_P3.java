import java.util.Scanner;
abstract class Shape {
    public abstract void draw();

    public abstract double calculateArea();
}

class Circle extends Shape{

    double radius;

    Circle (double radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius* radius;
    }
}

class Cylinder extends Shape{

    double height;
    double radius;

    Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cylinder");
    }

    @Override
    public double calculateArea() {
        return 2*Math.PI*radius*height + 2* Math.PI*radius*radius;
    }
}

public class W09_P3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        int height = in.nextInt();

        Shape circle = new Circle(radius);
        Shape cylinder = new Cylinder(radius, height);

        drawShapeAndCalculateArea(circle);
        drawShapeAndCalculateArea(cylinder);
    }

    public static void drawShapeAndCalculateArea(Shape shape) {
        shape.draw();
        double area = shape.calculateArea();
        System.out.printf("Area: %.4f%n", area);
    }
}