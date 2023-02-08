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
public class Bai27_Digital_root {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n >= 10) {
            // di tinh tong chu so cua n sau do gan lai cho n
            int tong = 0;
            while(n != 0) {
                tong += n % 10;
                n /= 10;
            }
            n = tong;
        }
        System.out.println(n);
    }
}
