
package Vong_lap;

import java.util.Scanner;

public class Bai15_Tinh_giai_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long gt = 1;
        for(int i = 1; i <= n ; i++ ){
            gt *= i;
        }
        System.out.println(gt);
    }
}
