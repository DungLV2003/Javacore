package Vong_lap;

import java.util.Scanner;

public class Bai16_Dem_so_luong_chu_so_cua_N {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 0) {
            System.out.println("1");
            return;
        }
        int cnt = 0;
        while(n != 0){
            cnt++;
            n/= 10;
        }
        System.out.println(cnt);
    }
}
