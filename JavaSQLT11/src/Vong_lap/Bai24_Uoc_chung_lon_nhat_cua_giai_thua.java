
package Vong_lap;

import java.util.Scanner;

public class Bai24_Uoc_chung_lon_nhat_cua_giai_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long min = Math.min(a, b);
        long gt = 1;
        for(int i = 1; i <= min; i++){
            gt *= i;
        }
        System.out.println(gt);
    }
}
