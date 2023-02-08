
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai6_Cap_so_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i <n;i++){
            a[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i< n - 1; i++)
            for(int j = i + 1; j < n; j++){
                if(a[i] + a[j] == k){
                    ++cnt;
                }
            }
        System.out.println(cnt);
    }
}
