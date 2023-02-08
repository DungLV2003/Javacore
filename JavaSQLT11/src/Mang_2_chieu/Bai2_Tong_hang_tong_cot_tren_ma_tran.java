package Mang_2_chieu;

import java.util.Scanner;

public class Bai2_Tong_hang_tong_cot_tren_ma_tran {

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
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += a[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println("");

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j][i];
            }
            System.out.print(sum + " ");
        }
    }
}
