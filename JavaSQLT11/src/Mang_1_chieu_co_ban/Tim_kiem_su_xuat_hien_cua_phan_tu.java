
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Tim_kiem_su_xuat_hien_cua_phan_tu {
    
    public static boolean timKiem(int a[], int n, int x){
        for(int i = 0; i < n; i++)
            if(a[i] == x) return true;
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println(timKiem(a, n, x));
    }
}
