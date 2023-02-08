
package Mang_1_chieu_nang_cao;

import java.util.Arrays;
import java.util.Scanner;

public class Bai15_BRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int res = Integer.MAX_VALUE, cnt = 0;
        for(int i = 1; i < n; i++){
            if(a[i] - a[i - 1] < res){
                res = a[i] - a[i - 1];
                cnt = 1;
            }
            else if(a[i] - a[i - 1] == res){
                ++cnt;
            }
        }
        System.out.println(res + " " + cnt);
    }
}
