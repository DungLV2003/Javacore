package Kieu_du_lieu;

import java.util.Scanner;

public class Bai32_Ghep_so {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k2 = sc.nextInt();
        int k3 = sc.nextInt();
        int k5 = sc.nextInt();
        int k6 = sc.nextInt();
        int k256 = Math.min(k2, Math.min(k5, k6));
        int k32 = Math.min(k3, k2 - k256);
        long res = 1l * 256 * k256 + 1l * k32 * 32;
        System.out.println(res);

    }
}
