
package Xau_ki_tu_nang_cao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai11_Sap_xep_cac_tu_khac_nhau_trong_xau_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        Arrays.sort(arr);
        for(String x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(a.length() != b.length())
                    return a.length() - b.length();
                else 
                    return a.compareTo(b);
            }
        });
        for(String x : arr){
            System.out.print(x + " ");
        }
    }
}
