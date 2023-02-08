
package Kieu_du_lieu;

import java.util.Scanner;

public class Bai17_Kiem_tra_chu_cai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if(c >= 'a' && c <= 'z'){
            System.out.println("LOWER");
        }
        else if (c >= 'A' && c <= 'Z'){
            System.out.println("UPPER");
        }
        else if (c >= '0' && c <= '9'){
            System.out.println("DIGIT");
        }
        else {
            System.out.println("SPECIAL");
        }
    }
}
