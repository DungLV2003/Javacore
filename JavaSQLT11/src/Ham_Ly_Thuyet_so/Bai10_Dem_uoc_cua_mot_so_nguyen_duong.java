
package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Bai10_Dem_uoc_cua_mot_so_nguyen_duong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res = 1;
        for(int i = 1; i <= t ; i++){
            int p = sc.nextInt(), e = sc.nextInt();
            res *= (e + 1);
            res %= 1000000007;
        }
        System.out.println(res);
    }
}
