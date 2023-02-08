
package Vong_lap;

import java.util.Scanner;

public class Bai8_Liet_ke_so_chinh_phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int dem = 0;
        for(long i  =1 ; i <= Math.sqrt(n); i++){
            System.out.print(1l * i *i + " ");
        }
    }
}
