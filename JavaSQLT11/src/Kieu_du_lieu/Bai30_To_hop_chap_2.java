
package Kieu_du_lieu;

import java.util.Scanner;

public class Bai30_To_hop_chap_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1l * n *(n-1)/2;
        System.out.println(res);
    }
}
