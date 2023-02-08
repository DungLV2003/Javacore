
package Mang_1_chieu_nang_cao;

import java.util.Scanner;

public class Bai24_Vi_tri_dau_tien_va_cuoi_cung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        int d = -1, c = -1;
        for(int i = 0; i < n; i++){
            if(a[i] == k){
                c = i + 1;
                if(d == -1){
                    d = i + 1;
                }
            }
        }
        System.out.println(d + "" + c);
    }
}
