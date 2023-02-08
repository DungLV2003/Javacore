
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai2_Trung_binh_cong_nguyen_to {
    
    public static boolean nguyenTo(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int tong = 0, dem = 0;
        for(int x : a){
            if(nguyenTo(x)){
                ++dem;
                tong += x;
            }
        }
        double trungBinh = (double) tong / dem;
        System.out.printf("%.3f", trungBinh);
    }
}
