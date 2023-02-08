
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai20_Dien_so_con_thieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i = 1; i < n; i++){
            if(a[i] != a[i - 1]){
                ans += a[i] - a[i - 1] -1;
            }
        }
        System.out.println(ans);
    }
}
