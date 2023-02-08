/*

Cho hai mảng số nguyên a và b gồm n và m phần tử. Gọi mảng c và d lần lượt
là mảng chỉ bao gồm các phần tử khác nhau của a và b. Hãy tìm mảng giao và hợp
của mảng c và d và liệt ke theo thứ tự tăng dần.

*/


package Set_map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Tim_hop_va_giao_cua_2_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> hop = new TreeSet<>();
        TreeSet<Integer> giao = new TreeSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            hop.add(x);
            set1.add(x);
        }
        for(int i = 0;i < n; i++){
            int x = sc.nextInt();
            hop.add(x);
            if(set1.contains(x)){
                giao.add(x);
            }
        }
        for(int x : giao) System.out.println( x + " ");
        System.out.println("");
        for(int x : hop) System.out.println( x + " ");
    }
}
