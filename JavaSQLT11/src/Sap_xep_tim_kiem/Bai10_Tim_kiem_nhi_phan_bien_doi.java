
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai10_Tim_kiem_nhi_phan_bien_doi {
    
    public static int ham1(int a[], int n, int x){
        int left = 0, right = n - 1, res = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] == x){
                res = mid;
                right = mid - 1;
            }
            else if (a[mid] < x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return res;
    }
    
    public static int ham2(int a[], int n, int x){
        int left = 0, right = n - 1, res = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] == x){
                res = mid;
                left = mid + 1;
            }
            else if (a[mid] < x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return res;
    }
    
    
    public static int ham3(int a[], int n, int x){
        int left = 0, right = n - 1, res = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] >= x){
                res = mid;
                right = mid - 1;
            }
           
            else{
                left = mid + 1;
            }
        }
        return res;
    }
    
    public static int ham4(int a[], int n, int x){
        int left = 0, right = n - 1, res = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] > x){
                res = mid;
                right = mid - 1;
            }
           
            else{
                left = mid + 1;
            }
        }
        return res;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i <n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int p1 = ham1(a, n, x), p2 = ham2(a, n, x);
        int p3 = ham3(a, n, x), p4 = ham4(a, n, x);
        System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4);
        if(p1 == -1) System.out.println("0");
        else System.out.println(p2 - p1 + 1);
    }
}
