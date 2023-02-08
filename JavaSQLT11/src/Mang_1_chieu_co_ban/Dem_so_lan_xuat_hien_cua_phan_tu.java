
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Dem_so_lan_xuat_hien_cua_phan_tu {
    
    public static int count(int a[], int n, int x){
        int res = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == x) ++res;
        }
        return res;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(count(a, n, x));
    }
}
