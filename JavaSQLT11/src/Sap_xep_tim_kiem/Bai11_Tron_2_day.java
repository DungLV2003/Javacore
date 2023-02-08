package Sap_xep_tim_kiem;


import java.util.Scanner;

public class Bai11_Tron_2_day {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] b = new int[n];
        int[] c = new int[m];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            c[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (b[i] <= c[j]) {
                System.out.print("b" + (i + 1) + " ");
                i++;
            } else {
                System.out.print("c" + (j + 1) + " ");
                j++;
            }
        }
        while (i < n) {
            System.out.print("b" + (i + 1) + " ");
            i++;
        }
        while (j< m) {
            System.out.print("c" + (j + 1) + " ");
            j++;
        }

    }
}
