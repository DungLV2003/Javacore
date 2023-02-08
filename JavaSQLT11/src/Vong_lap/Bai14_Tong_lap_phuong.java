
package Vong_lap;

import java.util.Scanner;

public class Bai14_Tong_lap_phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong = 0;
        for(int i = 1; i <= n; i++){
            tong += i*i*i;
        }
        System.out.println(tong);
    }
}
