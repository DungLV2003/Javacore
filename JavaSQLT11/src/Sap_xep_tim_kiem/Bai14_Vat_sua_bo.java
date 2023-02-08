
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai14_Vat_sua_bo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        long res = 0;
        for(int i = 0; i < n; i++){
            res += Math.max(0,a[i] - i);
        }
        System.out.println(res);
    }
}
