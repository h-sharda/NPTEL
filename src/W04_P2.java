import java.util.Scanner;
//Complete the code segment to define a class Point with parameter x,y and method skope() for calculating slope between two points.
// Note: Pass objectsof type class Point as argument in slope() method.
class Point {
    private double x;

    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double slope(Point p2){
        return (p2.y-this.y)/(p2.x-this.x);
    }
}
public class W04_P2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.print("Slope: "+p1.slope(p2));
    }
}