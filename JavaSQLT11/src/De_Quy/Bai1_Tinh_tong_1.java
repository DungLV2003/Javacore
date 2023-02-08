
package De_Quy;

import java.util.Scanner;

public class Bai1_Tinh_tong_1 {
    
    public static int sum(int n){
        if(n == 0) return 0;
        else return n * ( n + 1) /2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
 
    }
}
