
package Mang_1_chieu_nang_cao;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Bai9_Dem_tan_suat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        LinkedHashMap<Integer, Integer> map2 = new LinkedHashMap<>();
        
        int n = sc.nextInt();
        for(int i  = 0; i < n; i++ ){
            int x = sc.nextInt();
            if(map1.containsKey(x)){
                int tanSuat = map1.get(x);
                ++tanSuat;
                map1.put(x, tanSuat);
                map2.put(x, tanSuat);
            }
            else{
                map1.put(x, 1);
                map2.put(x, 1);
            }
        }
        
        Set<Map.Entry<Integer, Integer>> entrySet = map1.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("");
        Set<Map.Entry<Integer, Integer>> entrySet2 = map2.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySet2){
            System.out.println(entry.getKey() + " " + entry.getValue());    
            
        }
    }
}
