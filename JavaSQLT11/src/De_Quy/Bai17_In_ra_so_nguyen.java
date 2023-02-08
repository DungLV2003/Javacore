
package De_Quy;

import java.util.Scanner;

public class Bai17_In_ra_so_nguyen {
    
    public static void in1(long n ){
        if(n < 10){
            System.out.print(n % 10 +  " ");
        }
        else{
            System.out.print(n % 10 + " ");
            in1(n / 10);
        }
    }
    
    public static void in2(long n){
        if(n < 10){
            System.out.print(n % 10 + " ");
        }
        else{
            in2(n/ 10);
            System.out.print(n % 10 + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        in2(n);
        System.out.println("");
        in1(n);
        
    }
}
