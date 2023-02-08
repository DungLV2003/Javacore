package Set_map;

import java.util.HashSet;
import java.util.Scanner;

public class Bai1_Phan_tu_phan_biet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            set.add(x);
        }
        System.out.println(set.size());
    }
}
