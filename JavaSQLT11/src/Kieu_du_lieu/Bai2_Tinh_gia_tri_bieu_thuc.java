/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kieu_du_lieu;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Bai2_Tinh_gia_tri_bieu_thuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long S = (long) a*(b+c) + (long)b *(a +c);
        System.out.println(S);
    }
}
