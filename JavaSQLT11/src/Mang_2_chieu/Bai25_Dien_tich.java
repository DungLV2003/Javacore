package Mang_2_chieu;

import java.util.Scanner;

public class Bai25_Dien_tich {

    public static int[][] a = new int[1001][1001];
    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, -1, 1, 0};
    public static int n, m, cnt = 1;

    public static void loang(int i, int j) {
        a[i][j] = 0;
        for (int k = 0; k < 4; k++) {
            int inew = i + dx[k], jnew = j + dy[k];
            if (inew >= 0 && inew < n && jnew >= 0 && jnew < m && a[inew][jnew] == 1) {
                loang(inew, jnew);
                cnt++;
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
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    loang(i, j);
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
        }
        System.out.println(max);
    }
}
