package Encapsulation;

public class Test {

    public static void main(String[] args) {
        Point p1 = new Point(2, 2); //Doi ten co the dung refactor -> rename
        System.out.print("p1: ");

        p1.setX(4);
        p1.setY(5);
        System.out.print("p1: ");

        // p1 gọi từ method toString nếu không có toString thì sẽ in ra địa chỉ của p1 
        System.out.print("p1: " + p1);

        Point p2 = new Point(4, 7);
        System.out.print("p2: ");
        p2.setX(20);
        p2.setY(10);
        System.out.println(p2.getX() + p2.getY());

    }
}
