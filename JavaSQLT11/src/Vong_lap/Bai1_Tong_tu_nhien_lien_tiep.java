
package Vong_lap;

import java.util.Scanner;

public class Bai1_Tong_tu_nhien_lien_tiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
