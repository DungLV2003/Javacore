package Mang_2_chieu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai10_Dem_so_nguyen_to_tren_duong_cheo_chinh_va_phu_2 {

    public static boolean nt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(nt(a[i][i])){
                set.add(a[i][i]);
            }
            if(nt(a[i][n - 1 - i])){
                set.add(a[i][n - 1 -i]);
            }
        }
        System.out.println(set.size());
    }
}
