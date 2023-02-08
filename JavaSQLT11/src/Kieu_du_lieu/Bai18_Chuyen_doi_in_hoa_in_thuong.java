package Kieu_du_lieu;

import java.util.Scanner;

public class Bai18_Chuyen_doi_in_hoa_in_thuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if (c >= 'a' && c <= 'z') {
            c -= 32;
            System.out.println(c);
        } else if (c >= 'A' && c <= 'Z') {
            c += 32;
            System.out.println(c);
        } else {
            System.out.println(c);
        }
    }
}
