package Mang_2_chieu;

import java.util.Scanner;

public class Bai6_Hoan_vi_duong_cheo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            // Duong cheo chinh: a[i][i], Duong cheo phu: a[i][n - i - 1]
            int tmp = a[i][i];
            a[i][i] = a[i][n - i - 1];
            a[i][n - i - 1] = tmp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
