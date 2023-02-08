package OOP1;

import java.util.Scanner;

 class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        Point p = new Point(0, 0);
        p.x = sc.nextDouble();
        p.y = sc.nextDouble();
        return p;
    }

    public double getDistance(Point b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
}

 class Triangle {

    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid() {
        double ab = a.getDistance(b);
        double ac = a.getDistance(c);
        double bc = b.getDistance(c);
        if (ab > 0 && ac > 0 && bc > 0 && ab + ac > bc && ab + bc > ac && ac + bc > ab) {
            return true;
        } else {
            return false;
        }
    }

    public double getPerimeter() {
        double ab = a.getDistance(b);
        double ac = a.getDistance(c);
        double bc = b.getDistance(c);
        return ab + bc + ac;
    }

    public double getArea() {
        double ab = a.getDistance(b);
        double ac = a.getDistance(c);
        double bc = b.getDistance(c);
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc)); //cong thuc herong
    }

}

public class Main14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            }
            else{
                System.out.printf("%.3f %.3f\n", a.getPerimeter(), a.getArea());
            }
        }
    }
}
