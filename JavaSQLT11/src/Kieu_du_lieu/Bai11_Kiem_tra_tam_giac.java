
package Kieu_du_lieu;

import java.util.Scanner;

public class Bai11_Kiem_tra_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a){
            if(a == b && a == c){
                System.out.println("1");
            }
            else if(a == b || a == c || b == c){
                System.out.println("2");
            }
            else if((a*a == b*b + c*c)  || (b*b == c*c + a*a) || (c*c == a*a + b*b)){
                System.out.println("3");
            }
            else System.out.println("4");
        }
        else{
            System.out.println("INVALID");
        }
    }
}
