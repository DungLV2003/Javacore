
package Xau_ki_tu_nang_cao;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Bai13_Tan_xuat_cac_tu_xuat_hien_trong_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        TreeMap<String, Integer> map1 = new TreeMap<>();
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        for(String x : arr){
            if(map1.containsKey(x)){
                map1.put(x, 1 + map1.get(x));
                map2.put(x, 1 + map2.get(x));
            }
            else{
                map1.put(x, 1);
                map2.put(x, 1);
            }
        }
        Set<Map.Entry<String, Integer>> entry1 = map1.entrySet();
        for(Map.Entry<String, Integer> entry : entry1){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("");
        Set<Map.Entry<String, Integer>> entry2 = map2.entrySet();
        for(Map.Entry<String, Integer> entry : entry2){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
