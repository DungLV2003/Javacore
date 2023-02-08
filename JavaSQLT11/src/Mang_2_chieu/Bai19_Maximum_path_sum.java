package Mang_2_chieu;

import java.util.Scanner;

public class Bai19_Maximum_path_sum {

    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static int[][] a = new int[100][100];
    public static int n, m;

    public static void loang(int i, int j) {
        a[i][j] = 0;
        for (int k = 0; k < 8; k++) {
            int inew = i + dx[k], jnew = j + dy[k];
            if (inew >= 0 && inew < n && jnew >= 0 && jnew < m && a[inew][jnew] == 1) {
                loang(inew, jnew);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        long[][] F = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    F[i][j] = a[i][j];
                } else if (i == 0) {
                    F[i][j] = F[i][j - 1] + a[i][j];
                } else if (j == 0) {
                    F[i][j] = F[i - 1][j] + a[i][j];
                } else {
                    F[i][j] = Math.max(F[i - 1][j], F[i][j - 1]) + a[i][j];
                }
            }
        }
        System.out.println(F[n - 1][m - 1]);

    }

}
