
package Xau_ki_tu_nang_cao;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Bai10_Liet_ke_cac_tu_khac_nhau_trong_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        TreeSet<String> set1  = new TreeSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        for(String x : arr){
            set1.add(x);
            set2.add(x);
        }
        for(String x : set1){
            System.out.print(x + " ");
        }
        System.out.println("");
        for(String x : set2){
            System.out.print(x + " ");
        }
    }
}
