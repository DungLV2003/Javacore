
package Set_map;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class Bai3_Phan_tu_rieng_biet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int n = sc.nextInt();
        for(int i = 0;i <n; i++){
            int x = sc.nextInt();
            set.add(x);
        }
        for(int x : set){
            System.out.print(x + " ");
        }
    }
}
