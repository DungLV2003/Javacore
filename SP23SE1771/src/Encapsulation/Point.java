package Encapsulation;

class Point {

    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Circle {

    private Point center;
    private int radius;

    public Circle() {
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public boolean contains(Point point) {
        return (Math.pow(point.getX() - this.center.getX(), 2) + Math.pow(point.getY() - this.center.getY(), 2) <= Math.pow(this.radius, 2));
    }

    @Override
    public String toString() {
        return "Circle with center at (" + this.center.getX() + ", " + this.center.getY() + ") and radius " + this.radius;
    }
}
