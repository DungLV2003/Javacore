
package Mang_1_chieu_nang_cao;

import java.util.Scanner;

public class Bai19_Day_con_dai_nhat_cac_phan_tu_lien_ke_khac_nhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        int cnt = 1, res = 0;
        long sum = 0, tmp = a[0];
        int ind = 0;
        for(int i = 1; i < n; i++){
            if(a[i] != a[i-1]){
                ++cnt;
                tmp += a[i];
            }
            else{
                cnt = 1;
                tmp = a[i];
            }
            if(res < cnt)
            {
                res = cnt;
                sum = tmp;
                ind = i;
            }
            else if(res == cnt){
                if(sum < tmp){
                    sum = tmp;
                    ind = i;
                }
            }
        }
        System.out.println(res);
        for(int j = ind - res + 1; j <= ind; j++){
            System.out.print(a[j] + " ");
        }
    }
}
