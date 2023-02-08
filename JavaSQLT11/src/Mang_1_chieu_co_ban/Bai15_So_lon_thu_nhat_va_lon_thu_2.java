
package Mang_1_chieu_co_ban;

import java.util.Scanner;


public class Bai15_So_lon_thu_nhat_va_lon_thu_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        int max1 = (int) -1e9, max2 = (int) -1e9;
        for(int i = 0; i < n; i++){
            if(a[i] > max1){
                max2 = max1;
                max1= a[i];
            }
            else if(a[i] > max2){
                max2= a[i];
            }
        }
        System.out.print(max1 + " " + max2);
    }
}
