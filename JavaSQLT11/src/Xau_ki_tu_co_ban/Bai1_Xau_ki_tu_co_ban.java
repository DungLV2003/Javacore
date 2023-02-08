
package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai1_Xau_ki_tu_co_ban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() % 2 == 0){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println(s.charAt(s.length() / 2));
        }
    }
    
}
