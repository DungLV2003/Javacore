package Kieu_du_lieu;

import java.util.Scanner;

public class Bai34_Su_Hao_Phong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        int c5 = sc.nextInt();
        int tong = c1 + c2 + c3 + c4 + c5;
        if(tong % 5 == 0){
            int b = tong / 5;
            if(b != 0) System.out.println(b);
            else System.out.println("-1");
        }
        else{
            System.out.println("-1");
        }
    }
}
