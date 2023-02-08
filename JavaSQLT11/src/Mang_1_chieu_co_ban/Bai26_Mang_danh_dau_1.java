
package Mang_1_chieu_co_ban;

import java.util.Scanner;


public class Bai26_Mang_danh_dau_1 {
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[1000001];
        int maxVal = 0;
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            cnt[x] = 1;
            maxVal = Math.max(maxVal, x);
        }
        int dem = 0;
        for(int i = 0; i < 1000001; i++){
            if(cnt[i] != 0){
                ++dem;
            }
        }
        System.out.println(dem);
    }
}
