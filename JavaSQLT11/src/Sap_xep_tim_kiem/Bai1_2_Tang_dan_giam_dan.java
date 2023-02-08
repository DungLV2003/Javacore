
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;


public class Bai1_2_Tang_dan_giam_dan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int x : a){
            System.out.print(x + " ");
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
