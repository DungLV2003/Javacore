
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai20_Lon_hon_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 1 ; i < n-1; i++){
            if(a[i] > a[i - 1] && a[i] > a[i + 1] )
                System.out.print(a[i] + " ");
        }
        
    }
}
