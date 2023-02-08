package Mang_1_chieu_nang_cao;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bai12_Dem_tan_suat_so_nguyen_to {

    public static boolean nguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            int tmp = sc.nextInt();
            if (nguyenTo(tmp)) {
                if (map.containsKey(tmp)) {
                    int tanSuat = map.get(tmp);
                    ++tanSuat;
                    map.put(tmp, tanSuat);
                } else {
                    map.put(tmp, 1);
                }
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
