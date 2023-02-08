package Kieu_du_lieu;

import java.util.Scanner;

public class Bai20_Lat_da_quang_truong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int ngang, doc;
        if (n % a == 0) {
            doc = n / a;
        } else {
            doc = n / a + 1;
        }

        if (m % a == 0) {
            ngang = m / a;
        } else {
            ngang = m / a + 1;
        }

        long res = 1l * ngang * doc;
        System.out.println(res);
    }
}
