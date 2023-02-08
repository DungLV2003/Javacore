package String;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if (s.contains(t)) {
            System.out.println("firt_index = " + s.indexOf("day"));
            System.out.println("last_index = " + s.lastIndexOf("day"));
        }
        else System.out.println("NOT FOUND");
    }
}
