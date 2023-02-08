
package Mang_1_chieu_co_ban;

import java.util.Scanner;



public class Tim_phan_tu_nho_nhat_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        //Cach1:
        int maxElement = a[0], minElement = a[0];
        for(int i = 1; i < n; i++){
            if(a[i] > maxElement) maxElement = a[i];
            if(a[i] < minElement) minElement = a[i];
        }
        System.out.println(maxElement + " " + minElement);
        
        //Cach2:
        for(int i = 1; i < n; i++){
            maxElement = Math.max(a[i], maxElement);
            minElement = Math.min(a[i], minElement);
        }
        
        //Cach3:
        
        /*
        int maxElement = Integer.MIN_VALUE, minElement = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            maxElement = Math.max(a[i], maxElement);
            minElement = Math.min(a[i], minElement);
        }
        */
        
    }
}
