
package Vong_lap;

import java.util.Scanner;

public class Bai25_Thuong_giai_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long gt = 1;
        double res = 0;
        for(int i = 1; i <= n; i++){
            res += (double) 1/gt;
            gt *= i;
        }
        System.out.printf("%.4f", res);
    }
}
