
package Mang_1_chieu_nang_cao;

import java.util.Scanner;

public class Bai25_Mang012 {
    public static int[] cnt = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i <n; i++){
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        for(int i = 0; i < 3; i++){
            if(cnt[i] != 0){
                for(int j = 0; j < cnt[i]; j++){
                    System.out.println(i + " ");
                }
            }
        }
        
    }
}
