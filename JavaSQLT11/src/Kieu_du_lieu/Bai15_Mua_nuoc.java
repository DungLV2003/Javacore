/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kieu_du_lieu;

import java.util.Scanner;


public class Bai15_Mua_nuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if ( a * 2 <= b){             // khi đơn giá chai 1 lít nhỏ hơn chai 2 lít
            System.out.println(n * a);
        }
        else{
            if(n % 2 == 0){
                System.out.println(n / 2 * b);
            }
            else System.out.println(n /2 * b + a);
        }
    }
}
