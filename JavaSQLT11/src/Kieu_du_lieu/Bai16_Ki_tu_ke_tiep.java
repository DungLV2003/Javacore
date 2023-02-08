
package Kieu_du_lieu;

import java.util.Scanner;

public class Bai16_Ki_tu_ke_tiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if(c == 'z' || c == 'Z'){
            System.out.println("a");
        }
        else if(c >= 'a' && c <= 'z'){
            c += 1;
            System.out.println(c);
        }
        else{
            c = (char)(c + 32 +1);
            System.out.println(c);
        }
    }
}
