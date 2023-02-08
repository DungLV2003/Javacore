/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mang_1_chieu_co_ban;

import java.util.Scanner;


public class Bai3_So_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            min = Math.min(a[i], min);
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == min){
                ++cnt;
            }
        }
        System.out.println(cnt);
    }
}
