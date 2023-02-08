
package Mang_1_chieu_nang_cao;

import java.util.Scanner;


public class Bai21_Day_so_uu_the {
    
    public static boolean tangDan(int a[], int n){
        for(int i = 1; i < n; i++){
            if(a[i] <= a[i - 1]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] a = new int[100000];
        int chan = 0, le = 0;
        while(sc.hasNext()){
            int tmp = sc.nextInt();
            if(tmp % 2 == 0)++chan;
            else ++le;
            a[n] = tmp; ++n;
        }
        if((n % 2 == 0 && chan > le) || (n % 2 == 1 && le > chan)) System.out.println("YES");
        else System.out.println("NO");
    }
}
