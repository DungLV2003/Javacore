
package De_Quy;

import java.util.Scanner;

public class Bai23_Kiem_tra_mang_toan_chan {
    
    public static boolean chan(int a[], int n){
        if( n == 1) {
            if(a[0] % 2 == 0) return true;
            else return false;
        }
        else{
            if(a[n - 1] % 2 == 1) return false;
            else return chan(a, n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        if(chan(a, n)) System.out.println("YES");
        else System.out.println("NO");
    }
    
}
