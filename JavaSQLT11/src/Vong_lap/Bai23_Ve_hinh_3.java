package Vong_lap;

import java.util.Scanner;

public class Bai23_Ve_hinh_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(dem + " ");
                dem++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 1; i <= n; i++) {
            int ktao = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(ktao + " ");
                ++ktao;
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("~");
                } else {
                    System.out.print(i);
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 1; i <= n; i++) {
            int ktao = i;
            int kc = n - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(ktao + " ");
                ktao += kc;
                kc--;
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }
}
