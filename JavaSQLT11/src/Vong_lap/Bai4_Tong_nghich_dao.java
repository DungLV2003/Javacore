package Vong_lap;

import java.util.Scanner;

public class Bai4_Tong_nghich_dao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 * 1 / i;

        }
        System.out.printf("%.3f", sum);
    }
}
