
package Kieu_du_lieu;

import java.util.Scanner;

public class Bai24_Duong_di_ngan_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
        int kc1 = d1 + d2 + d3, kc2 = 2 * (d1 + d2) , kc3 = 2 * (d1 + d3) , kc4 = 2 * (d2 + d3);
        System.out.println(Math.min(Math.min(kc1, kc2), Math.min(kc3, kc4)));
    }
}
