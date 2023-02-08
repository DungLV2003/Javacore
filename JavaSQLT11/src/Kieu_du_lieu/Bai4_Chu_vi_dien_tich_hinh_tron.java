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
public class Bai4_Chu_vi_dien_tich_hinh_tron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        float chuVi = (float) (2*3.14*r);
        float dienTich = (float) (r * r * 3.14);
        System.out.printf("%.4f %.4f", chuVi, dienTich);
    }
}
