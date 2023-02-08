package Mang_1_chieu_nang_cao;

import java.util.Scanner;

public class Bai26_So_thao_tac_giup_mang_tang_dan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long res = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                int tmp = a[i - 1] - a[i] + 1;
                a[i] = a[i] + tmp;
                res += tmp;
            }
        }

        System.out.println(res);
    }
}
