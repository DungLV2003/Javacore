package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai7_In_ra_chu_so {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String digit = "", alpha = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                digit += x;
            } else {
                alpha += x;
            }
        }
        System.out.println(digit);
        System.out.println(alpha);
    }
}
