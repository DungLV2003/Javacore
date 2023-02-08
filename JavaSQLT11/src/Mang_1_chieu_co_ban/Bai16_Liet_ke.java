
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai16_Liet_ke {
    
    public static boolean nt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n >1;
    }
    
    public static boolean tongNt(int n){
        int tong = 0;
        while(n != 0){
            tong += n % 10;
            n /= 10;
        }
        return nt(tong);
    }
    
    public static  boolean thuanNghich(int n){
        int k = n; 
        int j = 0;
        while(n != 0){
            j = j * 10 + n % 10;
            n /=10;
        }
        return k == j;
    }
    
    public static boolean chinhPhuong(int n){
        int j = (int) Math.sqrt(n);
        return j * j == n;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int dem1 = 0, dem2 = 0, dem3 = 0, dem4 = 0;
        for(int i = 0 ; i < n ;i++){
            a[i] = sc.nextInt();
            if(nt(a[i])) ++dem1;
            if(thuanNghich(a[i])) ++dem2;
            if(chinhPhuong(a[i])) ++dem3;
            if(tongNt(a[i])) ++dem4;
        }
        System.out.println(dem1 + "\n" + dem2 + "\n" + dem3 + "\n" + dem4);
    }
}
