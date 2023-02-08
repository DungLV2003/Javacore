package Mang_1_chieu_co_ban;

import java.util.Arrays;
import java.util.Scanner;

public class Sap_xep_tang_giam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int x : a) {
            System.out.println(x + " ");
        }
        
        /*
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        for (int x : a) {
            System.out.println(x + " ");
        }
        
        */
    }
}
