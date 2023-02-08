
package De_Quy;

import java.util.Scanner;

public class Bai21_Kiem_tra_mang_doi_xung {
    
    public static boolean doiXung(int a[], int left, int right){
        if(left >= right) return true;
        if(a[left] != a[right]) return false;
        return doiXung(a, left + 1, right - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        if(doiXung(a, 0, n - 1)) System.out.println("YES");
        else System.out.println("NO");
    }
}
