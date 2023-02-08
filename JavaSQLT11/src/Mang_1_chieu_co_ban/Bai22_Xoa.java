
package Mang_1_chieu_co_ban;

import java.util.Scanner;


public class Bai22_Xoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(a[i] == x){
                for(int j = i; j <n - 1; j++){
                    a[j] = a[j + 1];
                }
                --n;
                for(int k = 0; k < n ; k++){
                    System.out.print(a[k] + " ");
                }
                return;
            }
        }
        System.out.println("NOT FOUND");
    }
}
