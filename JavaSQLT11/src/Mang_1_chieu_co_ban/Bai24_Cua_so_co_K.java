
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai24_Cua_so_co_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k =sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i <= n -k ;i++ ){
            long sum =0;
            for(int j = 0; j < k; j++){
                sum += a[ i + j];
            }
            System.out.print(sum + " ");
        }
        
    }
}
