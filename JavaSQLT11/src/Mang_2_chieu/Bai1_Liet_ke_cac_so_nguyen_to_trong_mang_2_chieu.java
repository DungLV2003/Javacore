package Mang_2_chieu;

import java.util.Scanner;

public class Bai1_Liet_ke_cac_so_nguyen_to_trong_mang_2_chieu {

    public static boolean nguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nguyenTo(a[i][j])) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }
}
