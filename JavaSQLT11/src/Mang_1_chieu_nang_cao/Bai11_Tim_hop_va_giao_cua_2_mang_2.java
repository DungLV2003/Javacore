package Mang_1_chieu_nang_cao;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai11_Tim_hop_va_giao_cua_2_mang_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> giao = new ArrayList<>();
        ArrayList<Integer> hop = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                giao.add(a[i]);
                hop.add(a[i]);
                ++i;
                ++j;
            } else if (a[i] < b[j]) {
                hop.add(a[i]);
                ++i;
            } else {
                hop.add(b[j]);
                ++j;
            }
        }
        while (i < n) {
            hop.add(a[i]); ++i;
        }
        while(j < m){
            hop.add(b[j]); ++j;
        }
        for(int x: hop){
            System.out.print(x + " ");
        }
        System.out.println("");
        for(int x : giao){
            System.out.print(x + " ");
        }
    }
}
