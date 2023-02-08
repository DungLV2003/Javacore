
package Mang_1_chieu_nang_cao;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Bai10_Tim_hop_va_giao_cua_2_mang_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> hop = new TreeSet<>();
        TreeMap<Integer, Integer> giao = new TreeMap<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            int x = sc.nextInt();
            hop.add(x);
            giao.put(x, 1);
        }
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            hop.add(x);
            if(giao.containsKey(x)){
                giao.put(x, 2);
        } 
        }    
        Set<Map.Entry<Integer, Integer>> entrySet = giao.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue() == 2){
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println("");
        for(int x : hop){
            System.out.print(x + " ");
        }
    }
}
