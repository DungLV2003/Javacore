package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Bai7_Cap_so_nguyen_to_cung_nhau {

    public static long gcd(long a,long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = a; i <= b - 1; i++) {
            for (int j = i + 1; j <= b; j++) {
                if (gcd(i, j) == 1) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
