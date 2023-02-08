package pro192;

import java.util.Scanner;

public class Buoi1_Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("Alice") || s.equals("Bob")) {
                System.out.println("Hello, " + s);
            } else {
                System.out.print("");
            }
        }

    }
}
