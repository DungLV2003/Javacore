package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai5_In_phan_tu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int check = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && i % 2 == 0) {
                System.out.print(a[i] + " ");
                check = 1;
            }
        }
        if(check == 0) System.out.println("NONE");
    }
}