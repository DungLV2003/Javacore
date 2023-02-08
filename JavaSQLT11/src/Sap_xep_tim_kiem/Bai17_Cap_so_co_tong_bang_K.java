
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai17_Cap_so_co_tong_bang_K {
    
    public static int ham1(int a[], int left, int right,int x){
        int res = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] == x) {
                res = mid;
                right = mid -1;
            }
            else if(a[mid] < x){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return res;
    }
    
       public static int ham2(int a[], int left, int right,int x){
        int res = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] == x) {
                res = mid;
                left = mid + 1;
            }
            else if(a[mid] < x){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return res;
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k =sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i <n ;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, 0, n);
        long ans = 0;
        for(int i = 0; i < n; i++){
            int pos1 = ham1(a, i + 1, n - 1, k - a[i]);
            int pos2 = ham2(a, i + 1, n - 1, k - a[i]);
            if(pos1 != -1)
               ans += pos2 - pos1 + 1;
        }
        System.out.println(ans);
    }
}
