/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vong_lap;

import java.util.Scanner;

public class Bai28_Tim_tong_giai_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long gt = 1;
        for(int i = 1; i <= n; i++){
            gt *= i;
            sum += gt;
        }
        System.out.println(sum);
    }
}
