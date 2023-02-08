package Mang_2_chieu;

import java.util.Scanner;

public class Bai7_Hoan_vi_hai_hang_cua_ma_tran {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int u = sc.nextInt(), v = sc.nextInt();
        --u;
        --v; //Vi de bai cho vi tri bat dau tu 1 nen phai lam vay de ra chi so mang
        for (int i = 0; i < n; i++) {  // Duyet tung cot
            // a[u][i], a[v][i]
            int tmp = a[u][i];
            a[u][i] = a[v][i];
            a[v][i] = tmp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
