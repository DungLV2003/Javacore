
package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Bai11_Uoc_so_nguyen_to_nho_nhat {
    
    
    public static boolean nguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
    
    public static int uocNguyenTo(int n){
        if(n == 1) return 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i ==0 ){
                return i;
            }
        }
        return n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(uocNguyenTo(i));
        }
    }
}
