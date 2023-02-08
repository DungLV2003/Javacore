
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4_Khaong_cach_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = (int) 1e9;
        for(int i = 1; i < n; i++){
            ans = Math.min(ans, a[i] - a[i - 1]);
        }
        System.out.println(ans);
    }
}
