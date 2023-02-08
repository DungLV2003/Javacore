
package De_Quy;

import java.util.Scanner;

public class Bai19_Kiem_tra_chu_so_chan {
    
    public static boolean chan(long n){
        if(n < 10){
            return n % 2 == 0;
        }
        else{
            if(n % 10 % 2 == 1)
                return false;
            else
                return chan(n /10);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(chan(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
