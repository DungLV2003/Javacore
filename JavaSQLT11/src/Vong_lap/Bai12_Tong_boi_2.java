package Vong_lap;

import java.util.Scanner;

public class Bai12_Tong_boi_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong = 0;
        for (int i = 2; i <= 2*n; i+= 2) {
            tong += i;
        }
        System.out.println(tong);
    }
}
