
package Xau_ki_tu_co_ban;

import java.util.Scanner;
public class Bai2_In_lat_nguoc_in_hoa_in_thuong {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}

