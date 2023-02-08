
package Xau_ki_tu_nang_cao;

import java.util.Scanner;

public class Bai9_Dem_so_luong_tu_trong_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        System.out.println(arr.length);
    }
}
