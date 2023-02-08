
package Mang_1_chieu_co_ban;

import java.util.Scanner;


public class Bai1_Cac_bai_toan_co_ban_tren_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int demChan = 0, demLe = 0, tongChan = 0, tongLe = 0;
        for(int x : a){
            if(x % 2 == 0){
                ++demChan;
                tongChan += x;
            }
            else{
                ++demLe;
                tongLe += x;
            }
        }
        System.out.println(demChan + "\n" + demLe + "\n" + tongChan + "\n" + tongLe + "\n");
    }
}
