package Kieu_du_lieu;

import java.util.Scanner;

public class Bai21_Frog {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int trai, phai;
        if (k % 2 == 0) {
            trai = phai = k / 2;
        } else {
            trai = k / 2;
            phai = trai + 1;

        }
        System.out.println(1l * phai * a - 1l * trai * b);
    }
}
