
package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Bai1_Kiem_tra_so_nguyen_to {
    
    public static boolean nguyenTo(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(nguyenTo(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
