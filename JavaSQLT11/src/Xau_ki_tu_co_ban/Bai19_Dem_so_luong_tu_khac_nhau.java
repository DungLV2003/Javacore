
package Xau_ki_tu_co_ban;

import java.util.HashSet;
import java.util.Scanner;

public class Bai19_Dem_so_luong_tu_khac_nhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String[] arr = s.split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String x : arr){
            set.add(x);
        }
        System.out.println(set.size());
    }
}
