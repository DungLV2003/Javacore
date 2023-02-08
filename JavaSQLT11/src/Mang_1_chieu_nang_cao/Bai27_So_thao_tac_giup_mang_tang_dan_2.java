
package Mang_1_chieu_nang_cao;

import java.util.Scanner;

public class Bai27_So_thao_tac_giup_mang_tang_dan_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextLong();
        long ans = 0;
        for(int i = 1; i < n; i++){
            if(a[i] <= a[i - 1]){
                long tmp = a[i - 1] - a[i] + 1;
                long q;
                if(tmp % d == 0) q = tmp / d;
                else q = tmp / d + 1;
                ans += q;
                a[i] += q * d;
            }
        }
        System.out.println(ans);
    }
}
