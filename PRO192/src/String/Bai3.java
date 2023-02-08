package String;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if (s.contains(t)) {
            String st1 = new String();
            String st2 = new String();
            if (t.equals("day")) {
                st1 = s.replaceAll(t, "");
                System.out.println(st1);
            }
            if (t.equals("is")) {
                st2 = s.replaceAll(t, "IS");
                System.out.println(st2);
            }
        }
    }
}
