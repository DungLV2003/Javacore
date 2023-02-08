package Vong_lap;

import java.util.Scanner;

public class Bai9_Tich_cac_uoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tich = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tich*= i;
            }
        }
        System.out.println(tich);
    }
}
