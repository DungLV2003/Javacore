package Vong_lap;

import java.util.Scanner;

public class Bai29_Tong_chan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = sc.nextInt();
            if (tmp % 2 == 0) {
                sum += tmp;
            }
        }
        System.out.println(sum);
    }
}
