
package Mang_1_chieu_nang_cao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai2_Kiem_tra_mang_tang_dan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Integer []a = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int res = Math.max(k,n-k);
        Arrays.sort(a, Collections.reverseOrder());
        long sum = 0;
        for(int i = 0; i < res; i++){
            sum += a[i];
        }
        long tmp = 0;
        for(int i = res; i < n; i++){
            tmp += a[i];
        }
        System.out.println(sum -tmp);
    }
}
