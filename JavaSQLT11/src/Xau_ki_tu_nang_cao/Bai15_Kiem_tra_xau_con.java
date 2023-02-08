
package Xau_ki_tu_nang_cao;

import java.util.Scanner;

public class Bai15_Kiem_tra_xau_con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if(s.contains(t)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
