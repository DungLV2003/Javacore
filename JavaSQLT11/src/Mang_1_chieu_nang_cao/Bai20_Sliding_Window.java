
package Mang_1_chieu_nang_cao;

import java.util.Scanner;

public class Bai20_Sliding_Window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n;i++){
            a[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 0; i < k; i++){
            sum += a[i];
        }
        long res = sum;
        int first_index = 0;
        for(int i = 1; i <= n - k; i++){
            sum = sum - a[i - 1] + a[i + k - 1];
            if(sum > res){
                res = sum;
                first_index = i;
            }
        }
        System.out.println(res);
        for(int i = 0;i <k; i++){
            System.out.print(a[first_index + i] + " ");
        }
    }
}
