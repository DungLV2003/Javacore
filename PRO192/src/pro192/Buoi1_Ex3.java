package pro192;

import java.util.Scanner;

public class Buoi1_Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max1 = (int) -1e9;
        for (int i = 0; i < n; i++) {
            if (a[i] > max1) {
                System.out.print(max1);
            }
        }
    }
}
