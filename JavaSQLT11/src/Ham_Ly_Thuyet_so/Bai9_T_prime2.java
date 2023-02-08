package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Bai9_T_prime2 {

    public static boolean nguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (nguyenTo(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
