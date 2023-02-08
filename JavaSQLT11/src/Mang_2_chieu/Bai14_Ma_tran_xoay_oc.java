package Mang_2_chieu;

import java.util.Scanner;

public class Bai14_Ma_tran_xoay_oc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        int dem = 1;
        while (dem <= n * n) {
            //Xay dung canh tren cung: co hang la h1, cot tu c1 toi c2
            for (int i = c1; i <= c2; i++) {
                a[h1][i] = dem++;
            }
            ++h1;
            //Xay dung canh ben phai: Co cot la c2, hang chay tu h1 => h2
            for (int i = h1; i <= h2; i++) {
                a[i][c2] = dem++;
            }
            --c2;
            //Xay dung canh duoi: Hang la h2, cot tu c2 => c1
            for (int i = c2; i >= c1; i--) {
                a[h2][i] = dem++;
            }
            --h2;
            //Xay dung canh ben trai
            for (int i = h2; i >= h1; i--) {
                a[i][c1] = dem++;
            }
            ++c1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
