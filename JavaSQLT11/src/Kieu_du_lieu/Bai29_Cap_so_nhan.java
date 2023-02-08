package Kieu_du_lieu;

import java.util.Scanner;

public class Bai29_Cap_so_nhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int cb;
        if (b % a == 0) {
            cb = b / a;
            if (b * cb == c && c * cb == d) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

}
