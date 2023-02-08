
package Xau_ki_tu_nang_cao;

import java.util.Scanner;

public class Bai3_Tan_suat_xuat_hien_cua_ky_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[256];
        for(char x : s.toCharArray()){
            cnt[x]++;
        }
        for(int i  = 0 ; i < 256 ; i++){
            if(cnt[i] != 0){
                System.out.println((char)i + " " + cnt[i]);
            }
        }
        System.out.println("");
        for(char x : s.toCharArray()){
            if(cnt[x] != 0){
                System.out.println(x + " " + cnt[x]);
                cnt[x] = 0;
            }
        }
    }
}
