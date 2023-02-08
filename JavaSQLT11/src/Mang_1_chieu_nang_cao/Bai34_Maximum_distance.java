
package Mang_1_chieu_nang_cao;

import java.util.HashMap;
import java.util.Scanner;

public class Bai34_Maximum_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k =sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        for(int i = 0; i < n; i++){
            if(map.containsKey(a[i] + k)){
                ans = Math.max(ans, i - map.get(a[i] + k));
            }
            if(map.containsKey(a[i] - k)){
                ans = Math.max(ans, i - map.get(a[i] - k));
            }
            if(!map.containsKey(a[i])){
                map.put(a[i], i);
            }
        }
        
        System.out.println(ans);
    }
}
