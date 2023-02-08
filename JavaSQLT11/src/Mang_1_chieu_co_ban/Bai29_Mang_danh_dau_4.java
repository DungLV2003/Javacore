

package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai29_Mang_danh_dau_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[1000001];
        int maxVal = 0;
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            int x = sc.nextInt();
            cnt[x]++;
            maxVal = Math.max(maxVal, x);
        }
        int tanSuat = 0, res = 0;
        for(int i = 0; i <= maxVal; i++){
            if(cnt[i] > tanSuat){
                tanSuat = cnt[i];
                res = i;
            }
        }
        System.out.println(res + " " + tanSuat);
    }
}
