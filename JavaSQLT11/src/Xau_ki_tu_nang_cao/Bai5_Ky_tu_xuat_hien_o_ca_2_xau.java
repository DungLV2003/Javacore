
package Xau_ki_tu_nang_cao;

import java.util.Scanner;


public class Bai5_Ky_tu_xuat_hien_o_ca_2_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int[] cnt1 = new int[256];
        int[] cnt2 = new int[256];
        for(char x : s.toCharArray()){
            cnt1[x] = 1;
        }
        for(char x : t.toCharArray()){
            cnt2[x] = 1;
        }
        for(int i = 0; i < 256; i++){
            if(cnt1[i] == 1 && cnt2[i] == 1){
                System.out.print((char)i);
            }
        }
        System.out.println("");
        for(int i = 0; i < 256; i++){
            if(cnt1[i] == 1 || cnt2[i] == 1){
                System.out.print((char)i);
            }
        }
    }
}
