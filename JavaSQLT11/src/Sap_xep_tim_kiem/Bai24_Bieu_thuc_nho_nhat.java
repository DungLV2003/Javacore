
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;


public class Bai24_Bieu_thuc_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, 1, n);
        long ans = a[0];
        for(int i = n -1; i >= 1; i--){
            if(k > 0){
                ans += a[i];
            }
            else ans -= a[i];
            --k;
        }
        System.out.println(ans);
    }
}
