/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vong_lap;

import java.util.Scanner;

public class Bai18_Dem_chu_so_nguyen_to_cua_so_nguyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        while (n != 0) {
            long r = n % 10;
            if (r == 2 || r == 3 || r == 5 || r == 7) 
                ++cnt;
            n /= 10;
        }
        System.out.println(cnt);
    }
}
