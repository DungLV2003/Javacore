package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai27_Mang_danh_dau_2 {

    public static int[] dem = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dem[a[i]]++;
        }
        int cnt = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (dem[i] != 0) {
                System.out.println(i + " " + dem[i]);
            }
        }
        
    }
}
