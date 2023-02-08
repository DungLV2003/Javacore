
package Sap_xep_tim_kiem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Bai2_Sap_xep_theo_tri_tuyet_doi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) < Math.abs(o2)) return -1;
                else return 1;
            }   
        });
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
