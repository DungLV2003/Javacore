
package Kieu_du_lieu;

import java.util.Scanner;

public class Bai33_Chia_tien {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int n = sc.nextInt();
       
       int tong = a + b +c + n;
       if(tong % 3 == 0){
           int res = tong / 3;
           if(res >= a && res >= b && res >= c){
                System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
       }
       else{
           System.out.println("NO");
       }
    }
}
