
package Vong_lap;

import java.util.Scanner;

public class Bai13_Tong_le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong = 0;
        for(int i = 1; i<= n; i++){
            tong += 2*i - 1;
        }
        System.out.println(tong);
    }
}
