
package Mang_1_chieu_co_ban;

import java.util.Scanner;


public class Mang_cong_don {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] F = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0) F[i] = a[i];
            else F[i] = F[i - 1] + a[i];
        }
        int q = sc.nextInt();
        while(q-- > 0){
            int left = sc.nextInt(), right = sc.nextInt();
            if(left == 0) System.out.println(F[right]);
            else
            System.out.println(F[right] - F[left - 1]);
        }    
    }
}
