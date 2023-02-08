
package Vong_lap;

import java.util.Scanner;


public class Bai2_Tong_binh_phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for(int i = 1; i<= n ; i++){
            sum += 1l *i*i;
        }
        System.out.println(sum);
    }
}
