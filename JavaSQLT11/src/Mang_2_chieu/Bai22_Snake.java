package Mang_2_chieu;

import java.util.Scanner;

public class Bai22_Snake {

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
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
