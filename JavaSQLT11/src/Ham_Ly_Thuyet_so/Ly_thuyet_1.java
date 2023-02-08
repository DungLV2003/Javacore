//1. UCLN, BCNN
//2. Luy thua nhi phan
//3. So fibonacci
//4. To hop chap K cua N
//5. Cong thuc Legendre tinh bac cua thua so nguyen to trong N!

package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Ly_thuyet_1 {
    //Constructive algorithm
    //gcd: Greatest common divisor
    //lcm: Least common multiple

//1. UCLN, BCNN
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

//2. Luy thua nhi phan (Binary exponentiation)
    public static long pow(long a, long b, long c) {
        long res = 1;
        while (b != 0) {
            //kiem tra bit cuoi cung cua b
            if (b % 2 == 1) {
                res = (res % c) * (a % c) % c; // ly thuyet dong du
            }
            b /= 2;
            a = (a % c) * (a % c) % c; //ly thuyet dong du
        }
        return res;
    }

    //Tinh: a ^ b % c
    public static long pow1(long a, long b, long c) {
        long res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
            res %= c;
        }
        return res;
    }


    /*    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pow(2, 1000000000000000000L, 10));
    }
}
     */
//3. In ra so fibonacci n so fibonacci dau tien
    public static long fibo(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        System.out.println("0\n1\n");
        long fn1 = 1, fn2 = 0, fn = 0;
        for (int i = 3; i <= n; i++) {
            System.out.println(fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;

        }
        return fn;
    }

    //Kiem tra 1 so co phai la so Fibonacci khong?
    public static boolean checkFibo(long n) {
        if (n == 0 || n == 1) {
            return true;
        }
        long fn1 = 1, fn2 = 0, fn;
        for (int i = 3; i <= 93; i++) {
            fn = fn1 + fn2;
            if (fn == n) {
                return true;
            }
            fn2 = fn1;
            fn1 = fn;
        }
        return false;
    }

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
    */
    
//4. To hop chap k cua n
    
    public static long toHop(int n, int k) {
        long res = 1;
        k = Math.min(k, n - k);  // C(k, n) = C(n-k, n)
        for(int i = 1; i <= k; i++){
            res *= (n - i + 1);
            res /= i;
        }
        return res;
    }
    
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toHop(10, 3));
    }
}
    */
    
//5. Cong thuc Legendre tinh bac cua thua so nguyen to trong N!
    
    public static long solve(int n, int p){
        long res = 0;
        for(int i = p; i <= n; i+= p){
            //phan tich xem trong boi cua p co bao nhieu so
            int tmp = i;
            while(tmp % p == 0){
                ++res;
                tmp /= p;
            }
        }
        return res;
    }
    
    //Cong thuc legendre
    
    public static long solve2(int n, int p){
        long res = 0;
        for(int i = p; i <= n; i *= p){
            //phan tich xem trong boi cua p co bao nhieu so
            res += n / i;
            // den day co the chia du
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println(solve(10, 2));
        }
    }
