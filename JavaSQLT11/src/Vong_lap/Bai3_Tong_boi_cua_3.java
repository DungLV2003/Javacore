
package Vong_lap;

import java.util.Scanner;

public class Bai3_Tong_boi_cua_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 3; i <= n; i += 3){
            sum += i;
        }
            System.out.println(sum);
    }
}
