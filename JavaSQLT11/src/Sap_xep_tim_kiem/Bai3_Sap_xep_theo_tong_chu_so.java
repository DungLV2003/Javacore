package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3_Sap_xep_theo_tong_chu_so {

    public static int tong(int n) {
        int tong = 0;
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int tong1 = tong(o1), tong2 = tong(o2);
                if (tong1 != tong2) {
                    if (tong1 < tong2) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    if (o1 < o2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        });
        for (int x : a) {
            System.out.print(x + " ");

        }
    }
}
