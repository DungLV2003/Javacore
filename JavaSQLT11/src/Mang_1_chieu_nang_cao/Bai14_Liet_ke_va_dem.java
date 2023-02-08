package Mang_1_chieu_nang_cao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Bai14_Liet_ke_va_dem {
    
    public final int MOD = (int) (1e9 + 7);
    
    public static boolean check(int n) {
        int x = n % 10;
        n /= 10;
        while (n > 0) {
            int y = n % 10;
            if (y > x) {
                return false;
            }
            x = y;
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            Integer x = sc.nextInt();
            if (check(x)) {
                list.add(x);
                if (map.containsKey(x)) {
                    int fre = map.get(x);
                    ++fre;
                    map.put(x, fre);
                } else {
                    map.put(x, 1);
                }
            }
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1) == map.get(o2)) {
                    return o1 - o2;
                }
                return map.get(o2) - map.get(o1);
            }
        });
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : list) {
            set.add(x);
        }
        for (int x : set) {
            System.out.println(x + " " + map.get(x));
        }
        
    }
}
