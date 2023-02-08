package pro192;

import java.util.Scanner;

public class Buoi1_Exercise {

   

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        System.out.println("Hello " + s);
    }
}
