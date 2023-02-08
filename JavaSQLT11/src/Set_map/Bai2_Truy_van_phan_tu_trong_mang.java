
package Set_map;

import java.util.HashSet;
import java.util.Scanner;


public class Bai2_Truy_van_phan_tu_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        for(int i = 0; i < n;i++){
            int x = sc.nextInt();
            set.add(x);
        }
        int q = sc.nextInt();
        while(q-- > 0){
            int x = sc.nextInt();
            if(set.contains(x)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
