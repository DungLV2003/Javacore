package Vong_lap;

import java.util.Scanner;

public class Bai11_Tong_chan_le {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                tong += i;
            } else {
                tong -= i;
            }
        }
        System.out.println(tong);
    }
}
