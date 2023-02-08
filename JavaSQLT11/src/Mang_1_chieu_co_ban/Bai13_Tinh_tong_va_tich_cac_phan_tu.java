
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai13_Tinh_tong_va_tich_cac_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        long tong = 0, tich = 1, mod = 1000000007;
        for(int x : a){
            tong += x;
            tich *= x;
            tong %= mod;
            tich %= mod;
        }
        System.out.println(tong);
        System.out.println(tich);
    }
}
