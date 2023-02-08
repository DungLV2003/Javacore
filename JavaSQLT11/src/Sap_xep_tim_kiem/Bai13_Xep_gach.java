
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai13_Xep_gach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        int ans = 1;
        int doCung = a[0];
        for(int i = 1; i < n; i++){
            if(doCung <= 0) break;
            ++ans;
            doCung = Math.min(doCung - 1 , a[i]);
        }
        System.out.println(ans);
    }
}
