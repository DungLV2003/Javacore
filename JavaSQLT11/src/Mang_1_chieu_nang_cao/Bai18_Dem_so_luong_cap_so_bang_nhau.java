
package Mang_1_chieu_nang_cao;

import java.util.Scanner;

public class Bai18_Dem_so_luong_cap_so_bang_nhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[1000001];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        long ans = 0;
        for(int i = 1; i <= 1000000; i++){
            if(cnt[i] != 0){
                ans += 1l * (cnt[i]) * (cnt[i] - 1) /2 ;
            }
        }
        System.out.println(ans);
    }
}
