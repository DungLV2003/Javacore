
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai23_Mang_cong_don {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        long[] F = new long[n];
        for(int i = 0 ; i < n; i++){
            if(i == 0) F[0] = a[0];
            else F[i] = F[i- 1] + a[i];
        }
        for(int i = 0 ; i < n; i++){
            System.out.print(F[i] + " ");
        }
    }
}
