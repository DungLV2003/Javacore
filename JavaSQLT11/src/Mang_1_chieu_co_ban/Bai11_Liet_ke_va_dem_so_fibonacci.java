
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai11_Liet_ke_va_dem_so_fibonacci {
    
    public static long [] Fibo = new long[100];
    
    public static boolean check(long n){
        for(int i = 0; i <= 92; i++){
            if(Fibo[i] == n) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibo[0] = 0;
        Fibo[1] = 1;
        for(int i = 2; i <= 92; i++){
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
        int n = sc.nextInt();
        boolean ok = false;
        long[] a = new long[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextLong();
        }
        for(int i = 0; i < n; i++){
            if(check(a[i])){
                System.out.print(a[i] + " ");
                ok = true;
            }
        }
        if(ok == false) {
            System.out.println("NONE");
        }
    }
}
