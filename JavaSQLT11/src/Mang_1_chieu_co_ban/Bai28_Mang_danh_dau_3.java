//Bai nay chi phu hop khi du lieu 0 <= a[i] <= 10^6
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai28_Mang_danh_dau_3 {

    public static int[] dem = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dem[a[i]]++;
        }
        for (int i = 0; i <= n; i++) {
            //in ra a[i] va dem[a[i]]
            if(dem[a[i]] != 0){
                System.out.println(a[i] + " " + dem[a[i]]);
                dem[a[i]] = 0;
            }
        }
    }
}
