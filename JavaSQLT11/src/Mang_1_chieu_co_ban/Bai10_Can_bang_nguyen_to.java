package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai10_Can_bang_nguyen_to {

    public static boolean nt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < i; j++) {
                left += a[j];
            }
            for (int j = i + 1; j < n; j++) {
                right += a[j];
            }
            
            if (nt(left) && nt(right)) {
                System.out.print(i + " ");
            }
        }
    }
}
