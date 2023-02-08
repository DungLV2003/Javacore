package Kieu_du_lieu;

import java.util.Scanner;

public class Bai23_Doremon_leo_cau_thang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min, max = n;
        if (n % 2 == 0) {
            min = n / 2;
        } else {
            min = n / 2 + 1;
        }
        int res = (min + m - 1) / m * m;
        if (res <= max) {
            System.out.println(res);
        } else {
            System.out.println("-1");
        }
    }
}
