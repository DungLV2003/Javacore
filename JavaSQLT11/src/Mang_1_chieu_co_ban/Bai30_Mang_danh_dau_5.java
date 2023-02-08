
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai30_Mang_danh_dau_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[1000001];
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int  i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        int tanSuat = 0, res = 0;
        for(int i = 0 ; i < n; i++){
            if(cnt[a[i]] > tanSuat){
                tanSuat = cnt[a[i]];
                res = a[i];
            }
        }
        System.out.println(res + " " + tanSuat);
    }
}
