
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai19_Lat_nguoc_mang {
    
    public static void lat(int a[], int n){
        for(int i = 0; i < n/2 ; i++){
            int tmp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = tmp;
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        lat(a, n);
        for(int x : a ){
            System.out.println(x + " ");
        }
    }
}
