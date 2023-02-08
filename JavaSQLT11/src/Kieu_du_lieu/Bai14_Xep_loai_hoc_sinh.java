
package Kieu_du_lieu;

import java.util.Scanner;

public class Bai14_Xep_loai_hoc_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         float a = sc.nextFloat();
         float b = sc.nextFloat();
         float c = sc.nextFloat();
         float d = sc.nextFloat();
         float res = (a + b + c * 2 + d*3)/7;
         if(res >= 8) System.out.println("GIOI");
         else if (res >= 6.5 && res < 8) System.out.println("KHA");
         else if (res < 6.5 && res >= 5) System.out.println("TRUNG BINH");
         else if (res < 5) System.out.println("YEU");
    }
}
