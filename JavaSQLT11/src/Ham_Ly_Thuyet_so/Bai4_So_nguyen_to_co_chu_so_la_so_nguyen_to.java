
package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Bai4_So_nguyen_to_co_chu_so_la_so_nguyen_to {
     public static boolean nguyenTo(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    
    public static boolean csnt(int n){
        while(n != 0){
            int r = n % 10;
            if(r != 2 && r != 3 && r != 5 && r != 7)
                return false;
            n/=10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(csnt(i) && nguyenTo(i)){   // Toi uu hon: nguyenTo(i) && csnt(i)
                ++cnt;
            }
        }
        System.out.println(cnt);
    }
}
