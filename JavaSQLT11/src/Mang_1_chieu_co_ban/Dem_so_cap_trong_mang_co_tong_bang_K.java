package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Dem_so_cap_trong_mang_co_tong_bang_K {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == k) {
                    ++ans;
                }
            }
        }
        System.out.println(ans);

    }
}
