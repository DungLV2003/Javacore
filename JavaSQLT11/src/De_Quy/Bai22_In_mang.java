
package De_Quy;

import java.util.Scanner;

public class Bai22_In_mang {
    
    public static void in1(int a[], int n){
        if(n > 0){
            System.out.print(a[n - 1] + " ");
            in1(a, n - 1);
        }
    }
    
    public static void in2(int a[], int n){
        if(n  > 0){
            in2(a, n - 1);
            System.out.print(a[n  - 1] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
        }
        in2(a, n);
        System.out.println("");
        in1(a, n);
    }
}
