
package Mang_1_chieu_nang_cao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Bai23_Tron_2_day_va_sap_xep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Integer[] b = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " " + b[i] + " ");
        }
    }
}
