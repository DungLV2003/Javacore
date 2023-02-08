
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai9_Tim_kiem_nhi_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int q = sc.nextInt();
        while(q-- > 0){
            int x = sc.nextInt();
            if(Arrays.binarySearch(a, x) >= 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        
    }   
}
