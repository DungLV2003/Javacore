
package Mang_1_chieu_co_ban;

import java.util.Scanner;
public class Bai14_Tim_gcd_cua_moi_phan_tu_trong_mang {
    
    //UCLN: gcd
    public static long gcd(long a, long b){
        while(b !=0){
            long r = a % b;
            a = b; 
            b = r;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ;i < n ; i++){
            a[i] = sc.nextInt();
        } 
        long res = 0;
        for(int x : a){
            res = gcd(res, x);
        }
        System.out.println(res);
        
    }
}
