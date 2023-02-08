
package Mang_1_chieu_nang_cao;

import java.util.Scanner;

public class Bai13_Doi_tien_tham_lam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] a = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        long ans = 0;
        for(int x : a){
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}
