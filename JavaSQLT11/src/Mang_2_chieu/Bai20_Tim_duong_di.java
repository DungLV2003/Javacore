package Mang_2_chieu;

import java.util.Scanner;

public class Bai20_Tim_duong_di {

    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, -1, 1, 0};
    public static int[][] a = new int[100][100];
    public static int n, m;

    public static void loang(int i, int j) {
        a[i][j] = 0;
        for (int k = 0; k < 4; k++) {
            int inew = i + dx[k], jnew = j + dy[k];
            if (inew >= 0 && inew < n && jnew >= 0 && jnew < m && a[inew][jnew] == 1) {
                loang(inew, jnew);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int s = sc.nextInt(), t = sc.nextInt(), u = sc.nextInt(), v = sc.nextInt();
        --s;
        --t;
        --u;
        --v;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        loang(s, t);
        if (a[u][v] == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
