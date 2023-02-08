
package Mang_1_chieu_co_ban;

import java.util.Scanner;


public class Bai12_Vi_tri_so_lon_nhat_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int min = (int) 1e9, max = (int) -1e9, min_pos = 0, max_pos = 0;
        for(int i = 0 ; i < n ; i++){
            if(a[i] > max){
                max = a[i];
                max_pos = i;   
            }
            if(a[i] <= min){
                min = a[i];
                min_pos = i;
            }
        }
        System.out.print(min_pos + " " + max_pos);
    }
}
