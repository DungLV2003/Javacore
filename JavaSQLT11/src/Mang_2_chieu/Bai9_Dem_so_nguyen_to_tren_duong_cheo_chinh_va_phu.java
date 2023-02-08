package Mang_2_chieu;

import java.util.Scanner;

public class Bai9_Dem_so_nguyen_to_tren_duong_cheo_chinh_va_phu {

    public static boolean nt(int n){
	for(int i = 2; i <= Math.sqrt(n); i++){
		if(n % i == 0) return false;
	}
	return n > 1;
}
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int dem =0;
	for(int i = 0; i< n; i++){
		if(nt(a[i][i])) ++dem;
		if(nt(a[i][n - i - 1])) ++dem;
	}
	if(n % 2 == 1){
		if(nt(a[n / 2][n / 2])) --dem;
	}
        System.out.print(dem);      
    }
}
