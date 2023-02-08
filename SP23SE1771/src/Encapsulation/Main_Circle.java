package Encapsulation;

import java.util.Scanner;

public class Main_Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x of point center: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y of point center: ");
        int y1 = sc.nextInt();
        Point center = new Point(x1, y1);
        int radius = 0;
        try {
            System.out.print("Enter a positive integer radius: ");
            radius = sc.nextInt();
            if (radius < 0) {
                throw new Exception("Negative number entered");
            }
            while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
         }

        } catch (Exception ex) {
            System.out.println("Invalid input. A positive integer is expected.");
            sc.close();
        }
        System.out.println("The number entered is: " + radius);
        Circle circle = new Circle(center, radius);
        System.out.println(circle.toString());
        System.out.println("Circumference: " + circle.circumference());
        System.out.println("Area: " + circle.area());
        System.out.print("Enter x coordinate of point: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate of point: ");
        int y = sc.nextInt();
        Point point = new Point(x, y);
        System.out.println("Contains point (" + point.getX() + ", " + point.getY() + ")? " + circle.contains(point));
    }
}
