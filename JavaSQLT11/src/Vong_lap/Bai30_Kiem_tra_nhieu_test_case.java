
package Vong_lap;

import java.util.Scanner;

public class Bai30_Kiem_tra_nhieu_test_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i= 1; i <= t; i++){
            int n = sc.nextInt();
            if(n % 2 == 0){
                System.out.println("EVEN");
            }
            else System.out.println("ODD");
        }
    }
}
