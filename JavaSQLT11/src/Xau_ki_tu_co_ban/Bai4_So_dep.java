package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai4_So_dep {

    public static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
