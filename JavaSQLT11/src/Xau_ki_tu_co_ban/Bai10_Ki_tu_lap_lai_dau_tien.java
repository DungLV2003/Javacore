
package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai10_Ki_tu_lap_lai_dau_tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[256];
        for(char x : s.toCharArray()){
            if(cnt[x] == 1){
                System.out.println(x);
                return;
            }
            cnt[x] = 1;
        }
        System.out.println("NONE");
    }
}
