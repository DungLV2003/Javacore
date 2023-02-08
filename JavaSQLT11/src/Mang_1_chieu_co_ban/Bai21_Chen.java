
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai21_Chen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[1005];
        for(int i = 0; i < n; i++ ){
            a[i] = sc.nextInt();
        }
        --k;
        for(int i = n; i > k; i--){
            a[i] = a[i -1];
        }
        a[k] = x;
        ++n;
        for(int i = 0; i< n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
