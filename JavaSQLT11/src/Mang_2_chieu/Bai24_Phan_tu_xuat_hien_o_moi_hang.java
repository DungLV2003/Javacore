package Mang_2_chieu;

import java.util.Scanner;

public class Bai24_Phan_tu_xuat_hien_o_moi_hang {

    public static int[][] a = new int[100][100];
    public static int n;
    public static int[] cnt = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               a[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (cnt[a[i][j]] == i - 1) {
                    cnt[a[i][j]] = i;
                }
            }
        }
        int check = 0;
        for (int i = 0; i <= 100; i++) {
            if (cnt[i] == n) {
                System.out.println(i + " ");
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("NOT FOUND");
        }
    }
}
