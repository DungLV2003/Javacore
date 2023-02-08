package Kieu_du_lieu;

import java.util.Scanner;

public class Bai22_Dong_xu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long S = sc.nextLong();
        if (S % n == 0) {
            System.out.println(S / n);
        } else {
            System.out.println(S / n + 1);
        }
    }
}
