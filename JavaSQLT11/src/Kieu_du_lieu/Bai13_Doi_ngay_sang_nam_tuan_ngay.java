
package Kieu_du_lieu;

import java.util.Scanner;

public class Bai13_Doi_ngay_sang_nam_tuan_ngay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nam = n / 365;
        n %= 365;
        int tuan = n / 7;
        n %= 7;
        System.out.println(nam + " " + tuan + " " + n);
    }
}
