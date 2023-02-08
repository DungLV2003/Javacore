
package Mang_1_chieu_nang_cao;

import java.util.Scanner;

public class Bai22_So_bi_lap_dau_tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt  = new int[1000001];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
            if(cnt[a[i]] != 0){
                System.out.println(a[i]);
                return;
            }
            cnt[a[i]] = 1;
        }
        System.out.println("-1");
    }
}
