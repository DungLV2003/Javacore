
package De_Quy;

import java.util.Scanner;

public class Bai24_Kiem_tra_mang_tang_dan {
    
    public static boolean tang(int a[], int n){
        if(n == 1) return true;
        else {
            if(a[n - 1] <= a[n - 2]) return false;
            else return tang(a, n - 1);
        }
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        if(tang(a, n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
