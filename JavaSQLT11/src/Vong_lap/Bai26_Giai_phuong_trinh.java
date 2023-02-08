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
public class Bai26_Giai_phuong_trinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),n = sc.nextInt();
        for(int i = 0; i <= n / a; i++){
            int r = n - a * i;
            if(r % b == 0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
