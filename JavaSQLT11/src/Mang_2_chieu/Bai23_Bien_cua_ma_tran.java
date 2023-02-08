package Mang_2_chieu;

import java.util.Scanner;

public class Bai23_Bien_cua_ma_tran {

    public static int[][] a = new int[100][100];
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                     System.out.print( a[i][j] + " ");
                }
            }
        }
    }
}
