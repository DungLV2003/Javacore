
package Kieu_du_lieu;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Bai8_Tong_hieu_tich_thuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long tong = (long) a + b;
        System.out.println(tong);
        int hieu = a - b;
        System.out.println(hieu);
        long tich = (long) a *b;
        System.out.println(tich);
        if(b != 0){
            double thuong = (double) a / b;
            System.out.printf("%.4f", thuong);
        }
        else System.out.println("INVALID");
        
    }
}
