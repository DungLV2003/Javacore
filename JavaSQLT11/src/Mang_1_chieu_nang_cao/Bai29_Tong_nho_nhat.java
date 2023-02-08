
package Mang_1_chieu_nang_cao;

import java.util.Arrays;
import java.util.Scanner;

public class Bai29_Tong_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n;i ++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long s1 = 0, s2 = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0) s1 = s1 * 10 + a[i];
            else s2 = s2 * 10 + a[i];
        }
        System.out.println(s1 + s2);
    }
}
