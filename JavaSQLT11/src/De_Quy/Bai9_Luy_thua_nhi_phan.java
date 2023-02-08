package De_Quy;

import java.util.Scanner;

public class Bai9_Luy_thua_nhi_phan {

    public static long binPow(long a,  long b) {
        int mod = 1000000007;
        if (b == 0) {
            return 1;
        }
        long tmp = binPow(a, b / 2);
        if (b % 2 == 1) {
            return ((tmp % mod) * (tmp % mod)) % mod * (a % mod) % mod;
        } else {
            return (tmp % mod) * (tmp % mod) % mod ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        System.out.println(binPow(a, b));
    }
}
