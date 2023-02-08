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
public class Bai9_Kiem_tra_nam_nhuan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 400 == 0 || (n %4 == 0 && n % 100 != 0)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

