
package Mang_1_chieu_nang_cao;


import java.util.Scanner;

public class Bai17_Truy_van_tong_tren_doan {
    
    public static void change(int n){
        n += 100;
    }
    
    public static void thayDoi(int a[], int n){
        for(int i = 0; i < n; i++){
            a[i] *= 2;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long[] pre = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(i == 0) pre[i] = a[i];
            else    
                pre[i] = pre[i - 1] + a[i];
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int l = sc.nextInt(), r = sc.nextInt();
            --l; --r;
            if(l == 0) System.out.println(pre[r]);
            else
                System.out.println(pre[r] - pre[l - 1]);
        }
        
        
    }
}
