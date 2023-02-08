
package De_Quy;

import java.util.Scanner;

public class Bai15_Tim_chu_so_dau_tien_cua_so_nguyen {
    
    public static long tachSo(long n){
        if(n < 10) return n;
        else return tachSo(n/10);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(tachSo(n));
    }
}
