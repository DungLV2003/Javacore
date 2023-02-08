
package Vong_lap;

import java.util.Scanner;

public class Bai7_Liet_ke_uoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        for(int i = 1; i <= n; i++){
            if(n % i ==0){
                ++dem;
            }
        }
        System.out.print(dem);
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
