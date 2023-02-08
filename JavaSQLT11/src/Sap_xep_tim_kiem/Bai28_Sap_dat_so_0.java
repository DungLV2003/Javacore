
package Sap_xep_tim_kiem;

import java.util.Scanner;

public class Bai28_Sap_dat_so_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(a[i] != 0){
                System.out.print(a[i] + " ");
            } 
        }
        for(int i = 0; i < n; i++){
            if(a[i] == 0){
                System.out.print("0" + " ");
            } 
        }
    }
}
