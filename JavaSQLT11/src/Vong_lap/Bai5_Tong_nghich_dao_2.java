
package Vong_lap;

import java.util.Scanner;


public class Bai5_Tong_nghich_dao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 2; i <= 2 * n; i += 2){
            sum += 1.0 * 1/i;
        }
        System.out.printf("%.5f", sum);
    }
}
