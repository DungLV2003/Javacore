
package Sap_xep_tim_kiem;

import java.util.Scanner;


public class Bai22_Sap_xep_chu_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[10];
        for(int i = 0; i <n; i++){
            a[i] = sc.nextInt();
            if(a[i] == 0) cnt[0] = 1;
            while(a[i] != 0){
                cnt[a[i] % 10] = 1;
                a[i] /= 10; 
            }
        }
        for(int i = 0 ; i< 10; i++){
            if(cnt[i] != 0) System.out.print(i + " ");
        }
    }
}
