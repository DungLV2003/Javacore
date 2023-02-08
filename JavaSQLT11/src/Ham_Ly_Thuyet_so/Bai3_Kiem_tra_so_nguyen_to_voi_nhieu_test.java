
package Ham_Ly_Thuyet_so;

import java.util.Scanner;


public class Bai3_Kiem_tra_so_nguyen_to_voi_nhieu_test {
    
     
    public static boolean nguyenTo(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            if(nguyenTo(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
