
package Xau_ki_tu_nang_cao;

import java.util.Scanner;

public class Bai4_Ky_tu_xuat_hien_nhieu_nhat_trong_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[256];
        for(char x : s.toCharArray()){
            cnt[x]++;
        }
        int minFre = Integer.MAX_VALUE, maxFre = Integer.MIN_VALUE;
        char res1 = ' ', res2 = ' ';
        for(int i = 0; i < 256; i++){
            if(cnt[i] >= maxFre){
                maxFre = cnt[i];
                res1 = (char)i;
            }
            if(cnt[i] != 0 && cnt[i] <= minFre){
                minFre = cnt[i];
                res2 = (char)i;
            }
        }
        System.out.println(res1 + " " + maxFre);
        System.out.println( res2 + " " + minFre);
    }
}
