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
public class Bai3_Doi_nhiet_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        float F =  (float) ((1.0*c * 9/5) + 32);
        System.out.printf("%.2f", F);
    }  
}
