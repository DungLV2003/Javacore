
package De_Quy;

import java.util.Scanner;

public class Bai20_Dem_so_thao_tac {
    
    public static int solve(int n){
        if(n == 1) return 0;
        int ans1 = (int) 1e9, ans2 = (int)1e9, ans3 = (int)1e9;
        if(n % 2 == 0) ans1 = solve(n / 2) + 1;
        if(n % 3 == 0) ans2 = solve(n / 3) + 1;
        if(n > 1) ans3 = solve(n - 1) + 1;
        return Math.min(ans1, Math.min(ans2, ans3));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
