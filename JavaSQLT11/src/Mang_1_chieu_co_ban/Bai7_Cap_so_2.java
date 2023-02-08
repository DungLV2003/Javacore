
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai7_Cap_so_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int res = Math.abs(a[i] - a[j]);
                min = Math.min(min, res);
            }
        }
        System.out.println(min);
    }
}
