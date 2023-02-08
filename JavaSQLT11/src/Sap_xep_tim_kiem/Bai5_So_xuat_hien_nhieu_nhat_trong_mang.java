
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5_So_xuat_hien_nhieu_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i <n; i++){
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        int ans = 1;
        int cnt = 1;
        int res = a[0];
        for(int i = 1; i < n; i++){
            if(a[i] == a[i - 1]){
                ++cnt;
            }
            else {
                if(cnt > ans){
                    ans = cnt;
                    res = a[i - 1];
                }
                cnt = 1;
            }
        }
        if(cnt  > ans ){
            ans = cnt;
            res = a[n - 1];
        }
        System.out.print(res + " " + ans);
    }
}
