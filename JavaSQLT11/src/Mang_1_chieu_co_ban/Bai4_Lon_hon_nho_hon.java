
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai4_Lon_hon_nho_hon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0 ; i < n ; i++){
            if(a[i] < x){
               ++cnt1;
            }
            else if(a[i] > x){
                ++cnt2;
            }
        }
        System.out.print(cnt1 + "\n" + cnt2);
    }
}
