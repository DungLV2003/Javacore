//1. So nguyen to
//2. Dem uoc, tinh tong uoc
//3. So chinh phuong
//4. So thuan nghich
//5. Phan tich thua so nguyen to
//6. Ly thuyet dong du
package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Ly_thuyet_2 {

//1. So nguyen to   
    public static boolean nguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        if (n > 1) {
            return true;
        } else {
            return false;
        }
    }

    /*    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 130;
        if(nguyenTo(a)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }        
}

     */
//2. Dem uoc, tinh tong uoc
    public static int tongUoc(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }

            }
        }
        return sum;
    }

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 130;
        System.out.println(tongUoc(a));
    }
}

     */
//3. So chinh phuong
    public static boolean chinhPhuong(int n) {
        int can = (int) Math.sqrt(n);
        if (can * can == n) {
            return true;
        } else {
            return false;
        }
    }

/*    
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = 45;
        System.out.println(chinhPhuong(a));
    }
}

*/
    
    
//4. So thuan nghich

public static boolean thuanNghich(int n){
    int lat = 0, tmp = 0;
    while(n != 0){
        lat = lat * 10 + n % 10;
        n /= 10;
    }
    if(lat == tmp) return true;
    else return false;
}

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(thuanNghich(1221));
    }
}

*/

//5. Phan tich thua so nguyen to


    public static void factorize(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                while(n % i == 0){
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
        //Xu ly thua so nguyen to cuoi cung co so mu la 1
        if(n > 1) System.out.print(n);
    }
    
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorize(60);
    }
}
    */

//6. Ly thuyet dong du
    
    //(A + B) % C = ((A % C) + (B % C)) % C
    //(A - B) % C = ((A % C) - (B % C)) % C
    //(A * B) % C = ((A % C) * (B % C)) % C
    //(A / B) % C = ((A % C) * (B^-1 % C)) % C
    
    //tinh a ^ b chia du cho c
    
    public static long powMod(long a, long b, long c){
        long res = 1;
        for(int i = 1; i <= b; i++){
            res *= a;
            res %= c;
                    
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(powMod(2, 1000, 10));
    }
}
