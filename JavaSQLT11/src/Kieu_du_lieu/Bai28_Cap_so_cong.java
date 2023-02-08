
package Kieu_du_lieu;

import java.util.Scanner;

public class Bai28_Cap_so_cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u1 = sc. nextInt();
        int d = sc.nextInt();
        long un = u1 + 1l * ( n -1 ) * d;
        long S = n * (u1 + un)/2;
        System.out.println(S);
              
    }
}
