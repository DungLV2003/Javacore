package Kieu_du_lieu;

import java.util.Scanner;

public class Bai26_So_lon_nhat_nho_nhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
        System.out.print(Math.max(Math.max(a, b), Math.max(c, d)) + " ");
        System.out.println(Math.min(Math.min(a,b), Math.min(c,d)));
    }
}
