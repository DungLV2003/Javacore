
package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Bai8_T_prime {
    
    public static boolean nguyenTo(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(nguyenTo(i)){
                System.out.print(1l * i * i + " ");
            }
        }
    }
}
