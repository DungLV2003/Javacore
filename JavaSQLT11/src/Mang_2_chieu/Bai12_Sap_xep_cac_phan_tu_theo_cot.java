package Mang_2_chieu;

import java.util.Arrays;
import java.util.Scanner;

public class Bai12_Sap_xep_cac_phan_tu_theo_cot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                b[j][i] = a[i][j]; 
            }
        }
        for(int i = 0; i < n; i++){
            Arrays.sort(b[i]);
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(b[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
