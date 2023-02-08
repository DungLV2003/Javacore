/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vong_lap;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Bai20_Bieu_dien_so_nguyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("-1\n");
        } else {
            System.out.println(n / 2);
            if (n % 2 == 0) {
                for (int i = 1; i <= n / 2; i++) {
                    System.out.println("2 ");
                }
            } else {
                for (int i = 1; i <= n / 2 - 1; i++) {
                    System.out.println("2 ");
                }
                System.out.println("3");
            }
        }
    }
}
