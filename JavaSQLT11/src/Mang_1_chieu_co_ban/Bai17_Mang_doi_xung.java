
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai17_Mang_doi_xung {
    
    public static boolean doiXung(int a[], int n){
        for(int i = 0; i < n / 2; i++){
            if(a[i] != a[n - i - 1]) return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        if(doiXung(a, n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
