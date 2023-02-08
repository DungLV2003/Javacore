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
public class Bai19_Mua_bia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kq = n /28;
        int vo = kq;
        while( vo >= 3){
            int bia = vo /3;
            kq += bia;
            vo = vo % 3 + bia;
        }
        System.out.println(kq);
    }
}
