package Mang_2_chieu;

import java.util.Scanner;

public class Bai21_Duong_di_cua_quan_Ma {

    public static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    public static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
    public static int[][] a = new int[100][100];
    public static int n;

    public static void loang(int i, int j) {
        a[i][j] = 0;
        for (int k = 0; k < 8; k++) {
            int inew = i + dx[k], jnew = j + dy[k];
            if (inew >= 0 && inew < n && jnew >= 0 && jnew < n && a[inew][jnew] == 1) {
                loang(inew, jnew);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt(), t = sc.nextInt(), u = sc.nextInt(), v = sc.nextInt();
        --s;
        --t;
        --u;
        --v;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        loang(s, t);
        if (a[u][v] == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
