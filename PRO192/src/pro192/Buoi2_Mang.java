/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Buoi2_Mang {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int maxElement = a[0], minElement = a[0];
        for(int i = 0; i < n; i++){
            maxElement = Math.max(a[i], maxElement);
            minElement = Math.min(a[i], minElement);
        }
        System.out.println(maxElement + " " +minElement);
        
        
    }
}
