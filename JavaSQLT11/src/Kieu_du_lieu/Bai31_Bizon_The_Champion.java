package Kieu_du_lieu;

import java.util.Scanner;

public class Bai31_Bizon_The_Champion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int n = sc.nextInt();
        int cup = a1 + a2 + a3, hc = b1 + b2 + b3;
        int ke1, ke2;
        if (cup % 5 == 0) {
            ke1 = cup / 5;
        } else {
            ke1 = cup / 5 + 1;
        }

        if (hc % 10 == 0) {
            ke2 = hc / 10;
        } else {
            ke2 = hc / 10 + 1;
        }
        if (ke1 + ke2 <= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
